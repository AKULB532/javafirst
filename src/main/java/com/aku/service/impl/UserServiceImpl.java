package com.aku.service.impl;

import com.aku.dao.UserDao;
import com.aku.dao.impl.UserDaoImpl;
import com.aku.pojo.User;
import com.aku.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public List<User> findAll() {
        UserDao userDao=new UserDaoImpl();

        return userDao.findAll();
    }
}
