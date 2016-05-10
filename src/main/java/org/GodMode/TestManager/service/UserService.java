package org.GodMode.TestManager.service;

import org.GodMode.TestManager.entities.Users;

import java.util.List;


public interface UserService {

    List<Users> findAll();
    Users find(Long id);
    void saveOrUpdate(Users entry);
    void delete(Users entry);
}
