package org.GodMode.TestManager.dao.impl;

import org.GodMode.TestManager.dao.Dao;
import org.GodMode.TestManager.entities.Questions;
import org.GodMode.TestManager.entities.Tests;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by nataliia on 03.05.16.
 */
public class QuestionsDaoImpl implements Dao<Questions, Long> {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    public List<Questions> findAll() {
        Session session = this.sessionFactory.openSession();
        List<Questions> questions = session.createQuery("FROM Questions").list();
        session.close();
        return questions;
    }

    public Questions find(Long id) {
        Session session = this.sessionFactory.openSession();
        Questions questions = session.get(Questions.class, id);
        session.close();
        return questions;
    }

    //TODO I think next methods could be moved to some above abstract layer
    //they are same in all DaoImpl-s
    public void saveOrUpdate(Questions entry) {
        if (entry == null) return;
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entry);
        transaction.commit();
        session.close();
    }

    public void delete(Questions entry) {
        if (entry == null) return;
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entry);
        transaction.commit();
        session.close();
    }
}
