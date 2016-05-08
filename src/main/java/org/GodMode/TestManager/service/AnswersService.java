package org.GodMode.TestManager.service;

import org.GodMode.TestManager.entities.Answers;

import java.util.List;

/**
 * Created by Oleg on 09.05.2016.
 */
public interface AnswersService {

    List<Answers> findAll();
    Answers find(Long id);
    void saveOrUpdate(Answers entry);
    void delete(Answers entry);
    
}
