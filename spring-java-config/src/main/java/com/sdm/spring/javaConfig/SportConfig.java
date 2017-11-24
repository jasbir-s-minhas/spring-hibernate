package com.sdm.spring.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("com.sdm.spring.javaConfig")
@PropertySource("classpath:sport.properties")
public class SportConfig {
    //Question:
    //  I am running the code for Java Configuration and injecting values from props file. However, I'm getting:
    //      ${foo.email}
    //      ${foo.team}
    // Instead of the actual property values. How can I resolve this?
    //
    //Answer
    //  This is an issue with Spring versions.
    //  If you are using Spring 4.2 and lower, you will need to add the code in bold.
    //---
    // add support to resolve ${...} properties
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceHolderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
