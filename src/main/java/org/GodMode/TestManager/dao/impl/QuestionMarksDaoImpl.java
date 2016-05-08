package org.GodMode.TestManager.dao.impl;

import org.GodMode.TestManager.dao.Dao;
import org.GodMode.TestManager.dao.utils.HibernateUtil;
import org.GodMode.TestManager.entities.QuestionMarks;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by ozinoviev on 5/4/2016.
 */
public class QuestionMarksDaoImpl implements Dao<QuestionMarks, Long> {

    @Autowired
    HibernateUtil hibernateUtil;

    @SuppressWarnings("unchecked")
    public List findAll() {
        Session session = hibernateUtil.getSessionFactory().openSession();
        List<QuestionMarks> questionMarksList = session.createQuery("FROM QuestionMarks").list();
        session.close();
        return questionMarksList;
    }

    public QuestionMarks find(Long id) {
        Session session = hibernateUtil.getSessionFactory().openSession();
        QuestionMarks questionMarks = (QuestionMarks) session.get(QuestionMarks.class, id);
        session.close();
        return questionMarks;
    }

    public void saveOrUpdate(QuestionMarks entry) {
        if (entry == null) return;
        Session session = hibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(entry);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(QuestionMarks entry) {
        if (entry == null) return;
        Session session = hibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(entry);
        session.getTransaction().commit();
        session.close();
    }
}

