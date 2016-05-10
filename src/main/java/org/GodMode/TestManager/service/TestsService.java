package org.GodMode.TestManager.service;

import org.GodMode.TestManager.entities.Tests;

import java.util.List;

/**
 * Created by ivankuptsov on 5/9/16.
 */
public interface TestsService {

    List<Tests> findAll();
    Tests find(Long id);
    void saveOrUpdate(Tests entry);
    void delete(Tests entry);

}
