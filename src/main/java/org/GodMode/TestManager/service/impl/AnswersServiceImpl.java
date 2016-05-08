package org.GodMode.TestManager.service.impl;

import org.GodMode.TestManager.dao.impl.AnswersDaoImpl;
import org.GodMode.TestManager.entities.Answers;
import org.GodMode.TestManager.service.AnswersService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Oleg on 09.05.2016.
 */
public class AnswersServiceImpl implements AnswersService {

    @Autowired
    AnswersDaoImpl answersDao;

    public List<Answers> findAll() {
        return answersDao.findAll();
    }

    public Answers find(Long id) {
        return answersDao.find(id);
    }

    public void saveOrUpdate(Answers entry) {
        answersDao.saveOrUpdate(entry);
    }

    public void delete(Answers entry) {
        answersDao.delete(entry);
    }
}
