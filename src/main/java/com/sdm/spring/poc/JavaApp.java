package com.sdm.spring.poc;

public class JavaApp {
    public static void main(String[] args) {
        // Construct new Coach object
        Coach coach = new BaseballCoach();

        // call method on the coach object.
        System.out.println(coach.getDailyWorkout());

        coach = new HockeyCoach();
        System.out.println(coach.getDailyWorkout());

    }
}
