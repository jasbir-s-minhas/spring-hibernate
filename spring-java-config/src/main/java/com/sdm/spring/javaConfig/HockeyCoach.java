package com.sdm.spring.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class HockeyCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;
    @Value("${foo.email.HCoach}")
    private String email;
    @Value("${foo.team.HCoach}")
    private String team;

    // Spring lifecycle init method
    @PostConstruct
    public void init(){
        System.out.println(">> HockeyCoach->init");
    }

    // Spring lifecycle destroy method
    @PreDestroy
    public void destroy(){
        System.out.println(">> HockeyCoach->destroy");
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
