package com.sda.alexjelescu.hibernate.utils;


import com.sda.alexjelescu.hibernate.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionManager extends AbstractSessionManager {
    private static final SessionManager INSTANCE = new SessionManager();

    private SessionManager() {
    }

    public static void shutDown() {
        INSTANCE.shutdownSessionManager();
    }

    public static SessionFactory getSessionFactory() {

        return INSTANCE.getSessionFactory("ProiectRestaurant");

    }

    @Override
    protected void setAnnotatedClasses(Configuration configuration) {
        configuration.addAnnotatedClass(AvailableTable.class);
        configuration.addAnnotatedClass(BookTable.class);
        configuration.addAnnotatedClass(Categories.class);
        configuration.addAnnotatedClass(DailyOffers.class);
        configuration.addAnnotatedClass(Products.class);
        configuration.addAnnotatedClass(User.class);


    }

}
