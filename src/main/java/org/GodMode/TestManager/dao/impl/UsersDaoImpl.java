package org.GodMode.TestManager.dao.impl;

import org.GodMode.TestManager.dao.Dao;
import org.GodMode.TestManager.entities.Answers;
import org.GodMode.TestManager.entities.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by ozinoviev on 5/4/2016.
 */
public class UsersDaoImpl implements Dao<Users, Long> {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List findAll() {
        Session session = this.sessionFactory.openSession();
        List<Users> usersList = session.createQuery("FROM Users").list();
        session.close();
        return usersList;
    }

    public Users find(Long id) {
        Session session = this.sessionFactory.openSession();
        Users users = (Users) session.get(Users.class, id);
        session.close();
        return users;
    }

    public void saveOrUpdate(Users entry) {
        if (entry == null) return;
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entry);
        transaction.commit();
        session.close();
    }

    public void delete(Users entry) {
        if (entry == null) return;
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entry);
        transaction.commit();
        session.close();
    }
}
