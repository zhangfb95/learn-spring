package com.juconcurrent.learn.spring.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    private SlayDragonQuest quest() {
        return new SlayDragonQuest(System.out);
    }
}
