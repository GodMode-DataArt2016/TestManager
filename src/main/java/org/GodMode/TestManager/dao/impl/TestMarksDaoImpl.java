package org.GodMode.TestManager.dao.impl;

import org.GodMode.TestManager.dao.Dao;
import org.GodMode.TestManager.entities.TestMarks;
import org.GodMode.TestManager.entities.Tests;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class TestMarksDaoImpl implements Dao<TestMarks, Long> {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List findAll() {
        Session session = this.sessionFactory.openSession();
        List<Tests> testsList = session.createQuery("FROM TestMarks").list();
        session.close();
        return testsList;
    }

    public TestMarks find(Long id) {
        Session session = this.sessionFactory.openSession();
        TestMarks testMarks = (TestMarks) session.get(TestMarks.class, id);
        session.close();
        return testMarks;
    }

    public void saveOrUpdate(TestMarks entry) {
        if (entry == null) return;
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entry);
        transaction.commit();
        session.close();
    }

    public void delete(TestMarks entry) {
        if (entry == null) return;
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entry);
        transaction.commit();
        session.close();
    }
}
