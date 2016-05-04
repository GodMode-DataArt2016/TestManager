package org.GodMode.TestManager.dao.impl;

import org.GodMode.TestManager.dao.Dao;
import org.GodMode.TestManager.entities.Block;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;
/**
 * Created by ozinoviev on 5/4/2016.
 */
public class BlockDaoImpl implements Dao<Block, Long> {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List findAll() {
        Session session = this.sessionFactory.openSession();
        List<Block> blockList = session.createQuery("FROM Block").list();
        session.close();
        return blockList;
    }

    public Block find(Long id) {
        Session session = this.sessionFactory.openSession();
        Block block = (Block) session.get(Block.class, id);
        session.close();
        return block;
    }

    public void saveOrUpdate(Block entry) {
        if (entry == null) return;
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entry);
        transaction.commit();
        session.close();
    }

    public void delete(Block entry) {
        if (entry == null) return;
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entry);
        transaction.commit();
        session.close();
    }
}
