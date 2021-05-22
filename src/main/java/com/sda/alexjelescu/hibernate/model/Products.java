package com.sda.alexjelescu.hibernate.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private Integer menuId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "price")
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "fk_categories_id")
    private Categories categories;

    @OneToMany(mappedBy = "products")
    private List<DailyOffers> dailyOffers;

    public Products() {
    }

    public Products(String productName, Integer quantity, Integer price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "menuId=" + menuId +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
