package com.teamtreehouse.giflib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by MICHAELChi on 2017-07-24.
 */
@EnableAutoConfiguration
@ComponentScan
public class AppConfig {
    public static void main(String[] args) {

        System.getProperties().put("server.port", 8081);
        SpringApplication.run(AppConfig.class, args);
    }
}
