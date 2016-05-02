package org.GodMode.TestManager.dao.impl;

import org.GodMode.TestManager.dao.Dao;
import org.GodMode.TestManager.entities.Tests;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Oleg on 03.05.2016.
 */
public class TestsDaoImpl implements Dao<Tests, Long> {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List findAll() {
        Session session = this.sessionFactory.openSession();
        List<Tests> testsList = session.createQuery("FROM Tests").list();
        session.close();
        return testsList;
    }

    public Tests find(Long id) {
        Session session = this.sessionFactory.openSession();
        Tests tests = (Tests) session.get(Tests.class, id);
        session.close();
        return tests;
    }

    public void saveOrUpdate(Tests entry) {
        if (entry == null) return;
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entry);
        transaction.commit();
        session.close();
    }

    public void delete(Tests entry) {
        if (entry == null) return;
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entry);
        transaction.commit();
        session.close();
    }
}
