package org.GodMode.TestManager.service;

import org.GodMode.TestManager.entities.Block;

import java.util.List;


public interface BlockService {

    List<Block> findAll();
    Block find(Long id);
    void saveOrUpdate(Block entry);
    void delete(Block entry);
}
