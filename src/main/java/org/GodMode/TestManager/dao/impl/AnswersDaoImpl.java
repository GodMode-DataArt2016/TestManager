package org.GodMode.TestManager.dao.impl;

import org.GodMode.TestManager.dao.Dao;
import org.GodMode.TestManager.entities.Answers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by ozinoviev on 5/4/2016.
 */
public class AnswersDaoImpl implements Dao<Answers, Long> {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List findAll() {
        Session session = this.sessionFactory.openSession();
        List<Answers> answersList = session.createQuery("FROM Answers").list();
        session.close();
        return answersList;
    }

    public Answers find(Long id) {
        Session session = this.sessionFactory.openSession();
        Answers answers = (Answers) session.get(Answers.class, id);
        session.close();
        return answers;
    }

    public void saveOrUpdate(Answers entry) {
        if (entry == null) return;
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entry);
        transaction.commit();
        session.close();
    }

    public void delete(Answers entry) {
        if (entry == null) return;
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entry);
        transaction.commit();
        session.close();
    }
}
