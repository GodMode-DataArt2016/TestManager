package org.GodMode.TestManager.dao.impl;

import org.GodMode.TestManager.dao.Dao;
import org.GodMode.TestManager.dao.utils.HibernateUtil;
import org.GodMode.TestManager.entities.Questions;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by nataliia on 03.05.16.
 */
public class QuestionsDaoImpl implements Dao<Questions, Long> {

    @SuppressWarnings("unchecked")
    public List findAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Questions> questionsList = session.createQuery("FROM Questions").list();
        session.close();
        return questionsList;
    }

    public Questions find(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Questions questions = (Questions) session.get(Questions.class, id);
        session.close();
        return questions;
    }

    public void saveOrUpdate(Questions entry) {
        if (entry == null) return;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(entry);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Questions entry) {
        if (entry == null) return;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(entry);
        session.getTransaction().commit();
        session.close();
    }
}
