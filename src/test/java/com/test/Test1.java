package com.test;

import com.myCode.dao.UserDao;
import com.myCode.entity.User;
import com.myCode.service.IUserService;
import com.mysql.jdbc.log.Slf4JLogger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring.xml")
public class Test1 {
   //static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

    //static Logger logger = LoggerFactory.getLogger(Test1.class);

    @Autowired
    User user;

    @Autowired
    IUserService userService;

    @Autowired
    UserDao userDao;

    @Test
    public void test1(){
       // User user2 = (User) context.getBean("user");
        System.out.println(user+" name: "+user.getName()+user.getAge());
       // System.out.println(user.getName());
       // user.setName("knightxu");
       // System.out.println(user.getName());
        userService.setName(user);
        //System.out.println(user2);
      //  System.out.println(user2.getName()+user2.getAge());
        //userService.setName(user2);
    }

    @Test
    public void test2()
    {
        //System.out.println(userDao);
      //  userDao.insertUser("1",1);
        Logger logger = LoggerFactory.getLogger(Test1.class);
logger.info("info log");
        User user2 = userDao.getUser("1");
        System.out.println(user2.getName()+user2.getAge());
    }

    @Test
    public void testTransactional()
    {
        List<User> list = new ArrayList<>();
        list.add(new User("zzzq",1));
        list.add(new User("zzqzz",2));
        userService.addUsers(list);
    }

}
