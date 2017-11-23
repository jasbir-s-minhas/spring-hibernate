package com.sdm.spring.poc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApp {
    public static void main(String[] args) {

        // load Spring Bean definitions
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // get bean from Spring container
        Coach coach1 = context.getBean("myBCoach", Coach.class);

        // close application context
        context.close();
    }
}
