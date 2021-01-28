package com.doubai.resume.service;

import com.doubai.resume.dao.mysql.UserDao;
import com.doubai.resume.model.mysql.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Optional<User> findById(String id) {
        return userDao.findById(id);
    }

    @Override
    public Optional<User> findByUser_account(String account) {
        return userDao.findByUser_account(account);
    }
}
