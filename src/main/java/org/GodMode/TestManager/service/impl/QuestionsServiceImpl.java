package org.GodMode.TestManager.service.impl;

import org.GodMode.TestManager.dao.impl.QuestionsDaoImpl;
import org.GodMode.TestManager.entities.Questions;
import org.GodMode.TestManager.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by ivankuptsov on 5/9/16.
 */
public class QuestionsServiceImpl implements QuestionsService{

    @Autowired
    QuestionsDaoImpl questionsDao;

    public List<Questions> findAll() {
        return questionsDao.findAll();
    }

    public Questions find(Long id) {
        return questionsDao.find(id);
    }

    public void saveOrUpdate(Questions entry) {
        questionsDao.saveOrUpdate(entry);
    }

    public void delete(Questions entry) {
        questionsDao.delete(entry);
    }
}
