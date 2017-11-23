package com.sdm.spring.poc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        // load bean definitions
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // get bean from Spring container
        Coach coach = context.getBean("myHCoach", Coach.class);

        // call method on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getFortune());
        System.out.println(((HockeyCoach)coach).getEmailAddress());
        System.out.println(((HockeyCoach)coach).getTeam());

        // get new bean from Spring container
        coach = context.getBean("myBCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getFortune());

        // close the Spring context
        context.close();
    }
}
