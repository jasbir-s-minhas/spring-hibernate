package com.sdm.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        SpringApp springApp = new SpringApp();
        springApp.comprehensiveTest();
        springApp.scopeTest();
    }

    public void comprehensiveTest(){
        // load Bean definition from Spring configRuration
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //get bean from Spring container
        Coach coach = context.getBean("hockeyCoach", Coach.class);
        System.out.println("+++++++Hockey Coach Messages++++++++++++");
        System.out.println(coach.toString());
        System.out.println("++++++++++++++++++++++++++++++++++++++++\n");

        //get bean from Spring container
        coach = context.getBean("baseballCoach", Coach.class);
        System.out.println("+++++++Baseball Coach Messages++++++++++");
        System.out.println(coach.toString());
        System.out.println("++++++++++++++++++++++++++++++++++++++++\n");

        context.close();
    }
    public void scopeTest(){
        // load Bean definition from Spring configuration
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
        // get bean from Spring container
        Coach coach1 = context.getBean("baseballCoach", Coach.class);
        Coach coach2 = context.getBean("baseballCoach", Coach.class);
        scopeTest(coach1, coach2);
        coach1 = context.getBean("hockeyCoach", Coach.class);
        coach2 = context.getBean("hockeyCoach", Coach.class);
        scopeTest(coach1, coach2);
        context.close();
    }
    private void scopeTest(final Coach coach1, final Coach coach2){
        boolean sameBean = (coach1 == coach2);
        System.out.println("Same bean : " + sameBean);
        System.out.println("coach1 location: " + coach1);
        System.out.println("coach2 location: " + coach2);
    }
}
