package org.GodMode.TestManager.dao.impl;

import org.GodMode.TestManager.dao.Dao;
import org.GodMode.TestManager.dao.utils.HibernateUtil;
import org.GodMode.TestManager.entities.Tests;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by Oleg on 03.05.2016.
 */
public class TestsDaoImpl implements Dao<Tests, Long> {

    @SuppressWarnings("unchecked")
    public List findAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Tests> testsList = session.createQuery("FROM Tests").list();
        session.close();
        return testsList;
    }

    public Tests find(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Tests tests = (Tests) session.get(Tests.class, id);
        session.close();
        return tests;
    }

    public void saveOrUpdate(Tests entry) {
        if (entry == null) return;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(entry);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Tests entry) {
        if (entry == null) return;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(entry);
        session.getTransaction().commit();
        session.close();
    }
}
