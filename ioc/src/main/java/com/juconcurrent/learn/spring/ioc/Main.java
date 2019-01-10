package com.juconcurrent.learn.spring.ioc;

import com.juconcurrent.learn.spring.ioc.vo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangfb
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
        User user1 = applicationContext.getBean("user1", User.class);
        System.out.println(user1);
    }
}
