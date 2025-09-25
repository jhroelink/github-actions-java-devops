package com.example.devopstraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsTrainingApplication {
    // Private constructor to prevent instantiation
    protected DevopsTrainingApplication() {
    }

    public static void main(final String[] args) {
        SpringApplication.run(DevopsTrainingApplication.class, args);
    }
}