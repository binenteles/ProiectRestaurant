package com.sda.alexjelescu.hibernate.repository;

import com.sda.alexjelescu.hibernate.interfaces.RepositoryInterface;
import com.sda.alexjelescu.hibernate.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class GenericRepository<T> implements RepositoryInterface {


    @Override
    public void findById(Object object, int id) {
        Session session = SessionManager.getSessionFactory().openSession();
        Class<T> aClass = session.find(Class.class, id);
        session.close();
        System.out.println(aClass);
    }

    @Override
    public void save(Object object) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(object);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Object object) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(object);
        transaction.commit();
        session.close();

    }

    @Override
    public void delete(Object object) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(object);
        transaction.commit();
        session.close();
    }
}
