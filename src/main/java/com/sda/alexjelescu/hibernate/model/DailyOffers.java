package com.sda.alexjelescu.hibernate.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "daily_offers")
public class DailyOffers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "daily_offer_id")
    private Integer dailyOfferId;
    @Column(name = "date")
    private Date date;
    @Column(name = "discount")
    private Integer discount;

    @ManyToOne
    @JoinColumn(name = "fk_product_id")
    private Products product;

    public DailyOffers() {
    }

    public DailyOffers(Date date, Integer discount) {
        this.date = date;
        this.discount = discount;
    }

    public DailyOffers(Date date, Integer discount, Products products) {
        this.date = date;
        this.discount = discount;
        this.product = products;
    }

    public Integer getDailyOfferId() {
        return dailyOfferId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "DailyOffers{" +
                "dailyOfferId=" + dailyOfferId +
                ", date=" + date +
                ", discount=" + discount +
                '}';
    }
}
