package com.learn.spring.ioc;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

/**
 * @author zhangfb
 */
public class Main {

    public static void main(String[] args) {
        MessageSource resources = new ClassPathXmlApplicationContext("beans.xml");
        String message = resources.getMessage("argument.required",
                new Object[]{"userDao"}, "Required", Locale.CHINA);
        System.out.println(message);
    }
}
