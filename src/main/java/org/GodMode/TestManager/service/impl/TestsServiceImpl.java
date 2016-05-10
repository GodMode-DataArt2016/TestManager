package org.GodMode.TestManager.service.impl;

import org.GodMode.TestManager.dao.impl.TestsDaoImpl;
import org.GodMode.TestManager.entities.Tests;
import org.GodMode.TestManager.service.TestsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by ivankuptsov on 5/9/16.
 */
public class TestsServiceImpl implements TestsService{

    @Autowired
    TestsDaoImpl testsDao;

    public List<Tests> findAll() {
        return testsDao.findAll();
    }

    public Tests find(Long id) {
        return testsDao.find(id);
    }

    public void saveOrUpdate(Tests entry) {
        testsDao.saveOrUpdate(entry);
    }

    public void delete(Tests entry) {
        testsDao.delete(entry);
    }
}
