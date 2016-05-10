package org.GodMode.TestManager.service.impl;

import org.GodMode.TestManager.entities.Users;
import org.GodMode.TestManager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class UserServiceImpl implements UserService {
    @Autowired
    UserServiceImpl userServiceDao;

    public List<Users> findAll() {
        return userServiceDao.findAll();
    }

    public Users find(Long id) {
        return userServiceDao.find(id);
    }

    public void saveOrUpdate(Users entry) {
        userServiceDao.saveOrUpdate(entry);
    }

    public void delete(Users entry) {
        userServiceDao.delete(entry);
    }
}
