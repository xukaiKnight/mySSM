package com.myCode.service.impl;

import com.myCode.dao.UserDao;
import com.myCode.entity.User;
import com.myCode.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    UserDao userDao;

    @Override
    public void setName(User user) {
        user.setName("xukai");
        System.out.println("new name: "+user.getName());
    }

    @Transactional
    @Override
    public void addUsers(List<User> list) {
        for(User user : list)
        {
            userDao.insertUser(user.getName(),user.getAge());
        }
    }

    @Override
    public User getUser(String name) {
        return userDao.getUser(name);
    }
}
