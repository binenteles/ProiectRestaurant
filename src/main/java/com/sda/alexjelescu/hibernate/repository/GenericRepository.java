package com.sda.alexjelescu.hibernate.repository;

import com.sda.alexjelescu.hibernate.interfaces.RepositoryInterface;
import com.sda.alexjelescu.hibernate.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class GenericRepository<T> implements RepositoryInterface<T> {


    @Override
    public void findById(T object, int id) {
        Session session = SessionManager.getSessionFactory().openSession();
        Class<T> aClass = session.find(Class.class, id);
        session.close();
        System.out.println(aClass);
    }

    @Override
    public void save(T object) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(object);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(T object) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(object);
        transaction.commit();
        session.close();

    }

    @Override
    public void delete(T object) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(object);
        transaction.commit();
        session.close();
    }
}
