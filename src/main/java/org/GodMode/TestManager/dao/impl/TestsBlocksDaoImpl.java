package org.GodMode.TestManager.dao.impl;

import org.GodMode.TestManager.dao.Dao;
import org.GodMode.TestManager.entities.TestsBlocks;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Oleg on 03.05.2016.
 */
public class TestsBlocksDaoImpl implements Dao<TestsBlocks, Long> {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List findAll() {
        Session session = this.sessionFactory.openSession();
        List<TestsBlocks> testsBlocksList = session.createQuery("FROM TestsBlocks").list();
        session.close();
        return testsBlocksList;
    }

    public TestsBlocks find(Long id) {
        Session session = this.sessionFactory.openSession();
        //need to check what is id? @Id or name of PK-column?
        TestsBlocks testsBlocks = (TestsBlocks) session.get(TestsBlocks.class, id);
        session.close();
        return testsBlocks;
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
