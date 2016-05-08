package org.GodMode.TestManager.dao.impl;

import org.GodMode.TestManager.dao.Dao;
import org.GodMode.TestManager.dao.utils.HibernateUtil;
import org.GodMode.TestManager.entities.Questions;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by nataliia on 03.05.16.
 */
public class QuestionsDaoImpl implements Dao<Questions, Long> {

    @Autowired
    HibernateUtil hibernateUtil;

    @SuppressWarnings("unchecked")
    public List findAll() {
        Session session = hibernateUtil.getSessionFactory().openSession();
        List<Questions> questionsList = session.createQuery("FROM Questions").list();
        session.close();
        return questionsList;
    }

    public Questions find(Long id) {
        Session session = hibernateUtil.getSessionFactory().openSession();
        Questions questions = (Questions) session.get(Questions.class, id);
        session.close();
        return questions;
    }

    public void saveOrUpdate(Questions entry) {
        if (entry == null) return;
        Session session = hibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(entry);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Questions entry) {
        if (entry == null) return;
        Session session = hibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(entry);
        session.getTransaction().commit();
        session.close();
    }
}
