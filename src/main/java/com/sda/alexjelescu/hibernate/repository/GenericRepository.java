package com.sda.alexjelescu.hibernate.repository;

import com.sda.alexjelescu.hibernate.interfaces.RepositoryInterface;
import com.sda.alexjelescu.hibernate.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;


public class GenericRepository<T> implements RepositoryInterface<T> {


    @Override
    public void findById(T object, int id) {
        Session session = SessionManager.getSessionFactory().openSession();
        Class<T> aClass = session.find(Class.class, id);
        System.out.println(aClass);

    }

    public List<T> findByColumn(T object, String column, String value)
    {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from " + object.getClass().getName() + " where " + column + "='" + value + "'" );
        List<T>  results = query.getResultList();
        transaction.commit();
        return results;

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

    public List<T> getAll(T object)
    {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from " + object.getClass().getName());
        List<T>  results = query.getResultList();
        transaction.commit();
        return results;
    }


}
