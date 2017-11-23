package com.sdm.spring.poc;

public class HappyFortuneService  implements FortuneService {
    public String getDailyFortune() {
        return "Today is your lucky day.";
    }
}
