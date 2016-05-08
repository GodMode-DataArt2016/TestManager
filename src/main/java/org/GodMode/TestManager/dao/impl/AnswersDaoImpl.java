package org.GodMode.TestManager.dao.impl;

import org.GodMode.TestManager.dao.Dao;
import org.GodMode.TestManager.dao.utils.HibernateUtil;
import org.GodMode.TestManager.entities.Answers;
import org.GodMode.TestManager.entities.TestsBlocks;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by ozinoviev on 5/4/2016.
 */
public class AnswersDaoImpl implements Dao<Answers, Long> {

    @SuppressWarnings("unchecked")
    public List findAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Answers> answersList = session.createQuery("FROM Answers").list();
        session.close();
        return answersList;
    }

    public Answers find(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Answers answers = (Answers) session.get(Answers.class, id);
        session.close();
        return answers;
    }

    public void saveOrUpdate(Answers entry) {
        if (entry == null) return;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(entry);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Answers entry) {
        if (entry == null) return;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(entry);
        session.getTransaction().commit();
        session.close();
    }
}
