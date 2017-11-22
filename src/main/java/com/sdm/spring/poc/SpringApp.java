package com.sdm.spring.poc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        // get application context
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // get bean from Spring container
        Coach coach = context.getBean("myCoach", Coach.class);

        // call method on the bean
        System.out.println(coach.getDailyWorkout());

        // close the Spring context
        context.close();
    }
}
