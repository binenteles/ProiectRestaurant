package com.sda.alexjelescu.hibernate.repository;

import com.sda.alexjelescu.hibernate.model.DailyOffers;
import com.sda.alexjelescu.hibernate.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DailyOffersRepository {
    public DailyOffers findById(Integer id) {
        Session session = SessionManager.getSessionFactory().openSession();
        DailyOffers dailyOffers = session.find(DailyOffers.class, id);
        session.close();
        return dailyOffers;
    }

    public void save(DailyOffers dailyOffers) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(dailyOffers);
        transaction.commit();
        session.close();
    }

    public void update(DailyOffers dailyOffers) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(dailyOffers);
        transaction.commit();
        session.close();
    }

    public void delete(DailyOffers dailyOffers) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(dailyOffers);
        transaction.commit();
        session.close();
    }
}
