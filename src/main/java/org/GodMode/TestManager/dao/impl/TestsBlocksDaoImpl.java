package org.GodMode.TestManager.dao.impl;

import org.GodMode.TestManager.dao.Dao;
import org.GodMode.TestManager.dao.utils.HibernateUtil;
import org.GodMode.TestManager.entities.TestsBlocks;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by Oleg on 03.05.2016.
 */
public class TestsBlocksDaoImpl implements Dao<TestsBlocks, Long> {

    @SuppressWarnings("unchecked")
    public List findAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<TestsBlocks> testsBlocksList = session.createQuery("FROM TestsBlocks").list();
        session.close();
        return testsBlocksList;
    }

    public TestsBlocks find(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        TestsBlocks testsBlocks = (TestsBlocks) session.get(TestsBlocks.class, id);
        session.close();
        return testsBlocks;
    }

    public void saveOrUpdate(TestsBlocks entry) {
        if (entry == null) return;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(entry);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(TestsBlocks entry) {
        if (entry == null) return;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(entry);
        session.getTransaction().commit();
        session.close();
    }
}
