package com.sdm.spring.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BaseballCoach implements Coach {
    private FortuneService fortuneService;
    @Value(value = "${foo.email.BCoach}")
    private String email;
    @Value(value = "${foo.team.BCoach}")
    private String team;

    public BaseballCoach() {
    }

    @Autowired
    public BaseballCoach(@Qualifier("randomFortuneService")FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    // Spring lifecycle init method
    @PostConstruct
    public void init(){
        System.out.println(">> BaseballCoach->init");
    }

    // Spring lifecycle destroy method
    @PreDestroy
    public void destroy(){
        System.out.println(">> BaseballCoach->destroy");
    }

    public String getDailyWorkout() {
        return "BaseballCoach workout advise.";
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
