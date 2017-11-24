package com.sdm.spring.javaConfig;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{
    public String getDailyFortune() {
        return "Random Fortune";
    }
}
