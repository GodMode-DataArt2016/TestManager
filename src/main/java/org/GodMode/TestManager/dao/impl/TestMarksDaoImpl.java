package org.GodMode.TestManager.dao.impl;

import org.GodMode.TestManager.dao.Dao;
import org.GodMode.TestManager.dao.utils.HibernateUtil;
import org.GodMode.TestManager.entities.TestMarks;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestMarksDaoImpl implements Dao<TestMarks, Long> {

    @Autowired
    HibernateUtil hibernateUtil;

    @SuppressWarnings("unchecked")
    public List findAll() {
        Session session = hibernateUtil.getSessionFactory().openSession();
        List<TestMarks> testMarksList = session.createQuery("FROM TestMarks").list();
        session.close();
        return testMarksList;
    }

    public TestMarks find(Long id) {
        Session session = hibernateUtil.getSessionFactory().openSession();
        TestMarks testMarks = (TestMarks) session.get(TestMarks.class, id);
        session.close();
        return testMarks;
    }

    public void saveOrUpdate(TestMarks entry) {
        if (entry == null) return;
        Session session = hibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(entry);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(TestMarks entry) {
        if (entry == null) return;
        Session session = hibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(entry);
        session.getTransaction().commit();
        session.close();
    }
}
