package com.learn.spring.resource;

import com.learn.spring.resource.service.QueryService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangfb
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        QueryService queryService = applicationContext.getBean(QueryService.class);
        queryService.query();
    }
}
