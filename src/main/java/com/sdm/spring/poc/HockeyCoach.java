package com.sdm.spring.poc;

import java.util.concurrent.Callable;

public class HockeyCoach implements Coach {

    private FortuneService fortuneService;

    private String emailAddress;

    private String team;


    public String getDailyWorkout() {
        return "Do daily Hockey Practice.";
    }

    public String getFortune() {
        return "Fortune from " + this.getClass().getSimpleName() + " " + fortuneService.getDailyFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(HockeyCoach.class.getSimpleName() + "->setFortuneService");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println(HockeyCoach.class.getSimpleName() + "->setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setTeam(String team) {
        System.out.println(HockeyCoach.class.getSimpleName() + "->setTeam");
        this.team = team;
    }

    public String getTeam() {
        return team;
    }
}
