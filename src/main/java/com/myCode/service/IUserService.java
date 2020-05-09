package com.myCode.service;

import com.myCode.entity.User;

import java.util.List;

public interface IUserService {
    public void setName(User user);
    public void addUsers(List<User> list);
    public User getUser(String name);
}
