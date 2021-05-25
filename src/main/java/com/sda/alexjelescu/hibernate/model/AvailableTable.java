package com.sda.alexjelescu.hibernate.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "available_table")
public class AvailableTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "available_table_id")
    private Integer availableTableId;
    @Column(name = "seats")
    private Integer seats;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;
    @Column(name = "table_info")
    private String tableInfo;

    @OneToMany(mappedBy = "availableTable")
    private List<BookTable> bookTables;

    public AvailableTable() {
    }

    public AvailableTable(Integer seats, Date startDate, Date endDate, String tableInfo) {
        this.seats = seats;
        this.startDate = startDate;
        this.endDate = endDate;
        this.tableInfo = tableInfo;
    }

    public AvailableTable(Integer availableTableId, Integer seats, Date startDate, Date endDate, String tableInfo, List<BookTable> bookTables) {
        this.availableTableId = availableTableId;
        this.seats = seats;
        this.startDate = startDate;
        this.endDate = endDate;
        this.tableInfo = tableInfo;
        this.bookTables = bookTables;
    }

    public Integer getAvailableTableId() {
        return availableTableId;
    }


    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getTableInfo() {
        return tableInfo;
    }

    public void setTableInfo(String tableInfo) {
        this.tableInfo = tableInfo;
    }

    @Override
    public String toString() {
        return "AvailableTable{" +
                ", seats=" + seats +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", tableInfo='" + tableInfo + '\'' +
                '}';
    }
}
