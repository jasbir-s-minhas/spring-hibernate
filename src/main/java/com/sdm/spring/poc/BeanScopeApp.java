package com.sdm.spring.poc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {
    public static void main(String[] args) {

        // load Spring Bean definitions
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // get bean from Spring container
        Coach coach1 = context.getBean("myBCoach", Coach.class);

        Coach coach2 = context.getBean("myBCoach", Coach.class);

        boolean sameBean = coach1 == coach2;

        System.out.println("Same bean : " + sameBean);

        System.out.println("coach1 location: " + coach1);

        System.out.println("coach2 location: " + coach2);


    }
}
