package com.myCode.dao;

import com.myCode.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    int insertUser(@Param("name") String name, @Param("age") int age);

    User getUser(String name1);
}
