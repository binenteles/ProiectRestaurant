package com.sda.alexjelescu.hibernate.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "book_table")
public class BookTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_table_id")
    private Integer bookTableId;
    @Column(name = "seats")
    private Integer seats;
    @Column(name = "start_book")
    private Date startBook;
    @Column(name = "end")
    private Date endBook;
    @Column(name = "table_info")
    private String tableInfo;

    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "fk_available_table_id")
    private AvailableTable availableTable;

    public BookTable() {
    }

    public BookTable(Integer seats, Date startBook, Date endBook, String tableInfo) {
        this.seats = seats;
        this.startBook = startBook;
        this.endBook = endBook;
        this.tableInfo = tableInfo;
    }

    public Integer getBookTableId() {
        return bookTableId;
    }


    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Date getStartBook() {
        return startBook;
    }

    public void setStartBook(Date startBook) {
        this.startBook = startBook;
    }

    public Date getEndBook() {
        return endBook;
    }

    public void setEndBook(Date endBook) {
        this.endBook = endBook;
    }

    public String getTableInfo() {
        return tableInfo;
    }

    public void setTableInfo(String tableInfo) {
        this.tableInfo = tableInfo;
    }

    @Override
    public String toString() {
        return "BookTable{" +
                "bookTable=" + bookTableId +
                ", seats=" + seats +
                ", startBook=" + startBook +
                ", endBook=" + endBook +
                ", tableInfo='" + tableInfo + '\'' +
                '}';
    }
}
