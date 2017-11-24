package com.sdm.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {
    public String getDailyFortune() {
        return "REST Fortune";
    }
}
