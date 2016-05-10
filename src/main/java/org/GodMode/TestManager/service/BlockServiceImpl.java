package org.GodMode.TestManager.service.impl;

import org.GodMode.TestManager.entities.Block;
import org.GodMode.TestManager.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class BlockServiceImpl implements BlockService {
    @Autowired
    BlockServiceImpl blockServiceDao;

    public List<Block> findAll() {
        return blockServiceDao.findAll();
    }

    public Block find(Long id) {
        return blockServiceDao.find(id);
    }

    public void saveOrUpdate(Block entry) {
        blockServiceDao.saveOrUpdate(entry);
    }

    public void delete(Block entry) {
        blockServiceDao.delete(entry);
    }
}
