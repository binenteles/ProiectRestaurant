package com.sda.alexjelescu.hibernate.repository;

import com.sda.alexjelescu.hibernate.model.Products;
import com.sda.alexjelescu.hibernate.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProductsRepository {
    public Products findById(Integer id) {
        Session session = SessionManager.getSessionFactory().openSession();
        Products products = session.find(Products.class, id);
        session.close();
        return products;
    }

    public void save(Products products) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(products);
        transaction.commit();
        session.close();
    }

    public void update(Products products) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(products);
        transaction.commit();
        session.close();
    }

    public void delete(Products products) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(products);
        transaction.commit();
        session.close();
    }
}
