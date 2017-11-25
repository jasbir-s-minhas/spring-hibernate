package com.sdm.spring.javaConfig;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class SpringAppTest {
    SpringApp springApp;

    @Before
    public void setUp() throws Exception {
        springApp = new SpringApp();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void main() throws Exception {
        SpringApp.main(new String[]{});
    }

    @Test
    public void comprehensiveTest() throws Exception {
        springApp.comprehensiveTest();
    }

    @Test
    public void scopeTest() throws Exception {
        springApp.scopeTest();
    }

    @Test
    public void beanScopeTest() throws Exception {
        // load bean definition from Sprint application config
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);
        // get bean from Spring container
        Coach coach1 = context.getBean("baseballCoach", Coach.class);
        Coach coach2 = context.getBean("baseballCoach", Coach.class);
        assertEquals(coach1, coach2);
        coach1 = context.getBean("hockeyCoach", Coach.class);
        coach2 = context.getBean("hockeyCoach", Coach.class);
        assertNotSame(coach1, coach2);
        context.close();
    }
}