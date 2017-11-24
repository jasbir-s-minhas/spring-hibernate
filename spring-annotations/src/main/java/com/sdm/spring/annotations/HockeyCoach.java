package com.sdm.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;
    private String email;
    private String team;

    // Spring lifecycle init method
    public void init(){
        System.out.println("HockeyCoach->init");
    }

    // Spring lifecycle destroy method
    public void destroy(){
        System.out.println("HockeyCoach->destroy");
    }

    public String getDailyWorkout() {
        return "HockeyCoach workout advise.";
    }

    //Using field dependency injection rather than method dependency injection
//    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return super.toString() + " {" +
                "fortuneService=" + fortuneService.getDailyFortune() +
                ", email='" + email + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
