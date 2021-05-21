package com.sda.alexjelescu.hibernate.repository;

import com.sda.alexjelescu.hibernate.model.Categories;
import com.sda.alexjelescu.hibernate.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CategoriesRepository {
    public Categories findById(Integer id) {
        Session session = SessionManager.getSessionFactory().openSession();
        Categories categories = session.find(Categories.class, id);
        session.close();
        return categories;
    }

    public void save(Categories categories) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(categories);
        transaction.commit();
        session.close();
    }

    public void update(Categories categories) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(categories);
        transaction.commit();
        session.close();
    }

    public void delete(Categories categories) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(categories);
        transaction.commit();
        session.close();
    }
}
