package com.sda.alexjelescu.hibernate.repository;


import com.sda.alexjelescu.hibernate.model.BookTable;
import com.sda.alexjelescu.hibernate.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BookTableRepository {
    public BookTable findById(Integer id) {
        Session session = SessionManager.getSessionFactory().openSession();
        BookTable bookTable = session.find(BookTable.class, id);
        session.close();
        return bookTable;
    }

    public void save(BookTable bookTable) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(bookTable);
        transaction.commit();
        session.close();
    }

    public void update(BookTable bookTable) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(bookTable);
        transaction.commit();
        session.close();
    }

    public void delete(BookTable bookTable) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(bookTable);
        transaction.commit();
        session.close();
    }
}
