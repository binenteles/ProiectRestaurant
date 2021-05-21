package com.sda.alexjelescu.hibernate.repository;

import com.sda.alexjelescu.hibernate.model.User;
import com.sda.alexjelescu.hibernate.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserRepository {
    public User findById(Integer id) {
        Session session = SessionManager.getSessionFactory().openSession();
        User user = session.find(User.class, id);
        session.close();
        return user;
    }

    public void save(User user) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    public void update(User user) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(user);
        transaction.commit();
        session.close();
    }

    public void delete(User user) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
        session.close();
    }
}
