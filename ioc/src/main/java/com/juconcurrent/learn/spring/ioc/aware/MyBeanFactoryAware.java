package com.juconcurrent.learn.spring.ioc.aware;

import com.juconcurrent.learn.spring.ioc.vo.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @author zhangfb
 */
public class MyBeanFactoryAware implements BeanFactoryAware {

    private BeanFactory beanFactory;

    @Override public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public void testAware() {
        User user = beanFactory.getBean("user", User.class);
        System.out.println(user);
    }
}
