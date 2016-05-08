package org.GodMode.TestManager.dao.impl;

import org.GodMode.TestManager.dao.Dao;
import org.GodMode.TestManager.dao.utils.HibernateUtil;
import org.GodMode.TestManager.entities.Block;
import org.GodMode.TestManager.entities.TestsBlocks;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;
/**
 * Created by ozinoviev on 5/4/2016.
 */
public class BlockDaoImpl implements Dao<Block, Long> {

    @SuppressWarnings("unchecked")
    public List findAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Block> blockList = session.createQuery("FROM Block").list();
        session.close();
        return blockList;
    }

    public Block find(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Block block = (Block) session.get(Block.class, id);
        session.close();
        return block;
    }

    public void saveOrUpdate(Block entry) {
        if (entry == null) return;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(entry);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Block entry) {
        if (entry == null) return;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(entry);
        session.getTransaction().commit();
        session.close();
    }
}
