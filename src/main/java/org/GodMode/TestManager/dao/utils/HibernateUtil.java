package org.GodMode.TestManager.dao.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.annotation.PreDestroy;

/**
 * Created by Oleg on 06.05.2016.
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        return new Configuration().configure().buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }

}
