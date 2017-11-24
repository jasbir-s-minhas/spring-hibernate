package com.sdm.spring.annotations;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;
    private String email;
    private String team;

    public BaseballCoach() {
    }

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    // Spring lifecycle init method
    public void init(){
        System.out.println("BaseballCoach->init");
    }

    // Spring lifecycle destroy method
    public void destroy(){
        System.out.println("BaseballCoach->destroy");
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
