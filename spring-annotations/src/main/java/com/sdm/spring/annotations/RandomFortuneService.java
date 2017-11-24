package com.sdm.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{
    public String getDailyFortune() {
        return "Random Fortune";
    }
}
