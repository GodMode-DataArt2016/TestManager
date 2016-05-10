package org.GodMode.TestManager.service;

import org.GodMode.TestManager.entities.Questions;

import java.util.List;

/**
 * Created by ivankuptsov on 5/9/16.
 */
public interface QuestionsService {

    List<Questions> findAll();
    Questions find(Long id);
    void saveOrUpdate(Questions entry);
    void delete(Questions entry);

}
