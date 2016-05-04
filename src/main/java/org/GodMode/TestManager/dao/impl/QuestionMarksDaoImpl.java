package org.GodMode.TestManager.dao.impl;

import org.GodMode.TestManager.dao.Dao;
import org.GodMode.TestManager.entities.QuestionMarks;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by ozinoviev on 5/4/2016.
 */
public class QuestionMarksDaoImpl implements Dao<QuestionMarks, Long> {

        private SessionFactory sessionFactory;

        public void setSessionFactory(SessionFactory sessionFactory) {
            this.sessionFactory = sessionFactory;
        }

        public List findAll() {
            Session session = this.sessionFactory.openSession();
            List<QuestionMarks> questionMarksList = session.createQuery("FROM QuestionMarks").list();
            session.close();
            return questionMarksList;
        }

        public QuestionMarks find(Long id) {
            Session session = this.sessionFactory.openSession();
            //need to check what is id? @Id or name of PK-column?
            QuestionMarks questionMarks = (QuestionMarks) session.get(QuestionMarks.class, id);
            session.close();
            return questionMarks;
        }

        public void saveOrUpdate(QuestionMarks entry) {
            if (entry == null) return;
            Session session = this.sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(entry);
            transaction.commit();
            session.close();
        }

        public void delete(QuestionMarks entry) {
            if (entry == null) return;
            Session session = this.sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.delete(entry);
            transaction.commit();
            session.close();
        }
}

