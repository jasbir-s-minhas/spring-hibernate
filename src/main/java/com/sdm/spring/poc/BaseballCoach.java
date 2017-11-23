package com.sdm.spring.poc;

public class BaseballCoach implements Coach {

    // define private field for dependency
    private FortuneService fortuneService;

    public BaseballCoach(){

    }

    // Spring init method
    public void init(){
        System.out.println("BaseballCoach->init");
    }

    // Spring destroy method
    public void destroy(){
        System.out.println("BaseballCoach->destroy");
    }

    // define constructor for dependency injection
    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Do daily Baseball Practice.";
    }

    public String getFortune() {
        return "Fortune from " + this.getClass().getSimpleName() + " " + fortuneService.getDailyFortune();
    }

}
