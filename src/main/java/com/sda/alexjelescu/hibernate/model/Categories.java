package com.sda.alexjelescu.hibernate.model;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Integer categoryId;
    @Column(name = "main_course")
    private String mainCourse;
    @Column(name = "secondary_course")
    private String secondaryCourse;
    @Column(name = "desert")
    private String desert;
    @Column(name = "drinks")
    private String drinks;

    public Categories() {
    }

    public Categories(String mainCourse, String secondaryCourse, String desert, String drinks) {
        this.mainCourse = mainCourse;
        this.secondaryCourse = secondaryCourse;
        this.desert = desert;
        this.drinks = drinks;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public String getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    public String getSecondaryCourse() {
        return secondaryCourse;
    }

    public void setSecondaryCourse(String secondaryCourse) {
        this.secondaryCourse = secondaryCourse;
    }

    public String getDesert() {
        return desert;
    }

    public void setDesert(String desert) {
        this.desert = desert;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "categoryId=" + categoryId +
                ", mainCourse='" + mainCourse + '\'' +
                ", secondaryCourse='" + secondaryCourse + '\'' +
                ", desert='" + desert + '\'' +
                ", drinks='" + drinks + '\'' +
                '}';
    }
}
