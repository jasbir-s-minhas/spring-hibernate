package com.sdm.spring.javaConfig;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyFortune() {
        return "Today is your lucky day.";
    }
}
