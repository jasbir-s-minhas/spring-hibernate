package com.sdm.spring.javaConfig;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {
    public String getDailyFortune() {
        return "REST Fortune";
    }
}
