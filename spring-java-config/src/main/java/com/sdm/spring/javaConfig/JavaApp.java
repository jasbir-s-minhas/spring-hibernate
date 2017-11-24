package com.sdm.spring.javaConfig;

public class JavaApp {
    public static void main(String[] args) {
        Coach coach = new BaseballCoach();
        System.out.println(coach.getDailyWorkout());
        coach = new HockeyCoach();
        System.out.println(coach.getDailyWorkout());
    }
}
