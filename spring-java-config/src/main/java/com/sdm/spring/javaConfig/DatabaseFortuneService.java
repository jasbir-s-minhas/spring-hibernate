package com.sdm.spring.javaConfig;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
    public String getDailyFortune() {
        return "Database Fortune";
    }
}
