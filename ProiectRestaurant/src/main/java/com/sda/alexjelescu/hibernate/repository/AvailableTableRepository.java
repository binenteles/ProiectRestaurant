package com.sda.alexjelescu.hibernate.repository;

import com.sda.alexjelescu.hibernate.model.AvailableTable;
import com.sda.alexjelescu.hibernate.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AvailableTableRepository {
    public AvailableTable findById(Integer id){
        Session session = SessionManager.getSessionFactory().openSession();
        AvailableTable availableTable = session.find(AvailableTable.class, id);
        session.close();
        return availableTable;
    }

    public void save(AvailableTable availableTable){
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(availableTable);
        transaction.commit();
        session.close();
    }
    public void update(AvailableTable availableTable){
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(availableTable);
        transaction.commit();
        session.close();
    }
    public void delete(AvailableTable availableTable){
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(availableTable);
        transaction.commit();
        session.close();
    }
}
