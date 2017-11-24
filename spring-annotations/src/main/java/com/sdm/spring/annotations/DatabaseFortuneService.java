package com.sdm.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
    public String getDailyFortune() {
        return "Database Fortune";
    }
}
