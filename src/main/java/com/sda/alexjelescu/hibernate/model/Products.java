package com.sda.alexjelescu.hibernate.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @OneToMany(mappedBy = "product")
    private List<DailyOffers> dailyOffers;

    @ManyToMany(mappedBy = "products")
    private Set<User> users = new HashSet<>();

    public Products() {
    }

    public Products(String productName, Integer quantity, Integer price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public Products(String productName, Integer quantity, Integer price, Categories categories) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.categories = categories;
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

    public Categories getCategories() {
        return categories;
    }



    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
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
