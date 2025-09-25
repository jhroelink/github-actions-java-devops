package com.example.devopstraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
final public class DevopsTrainingApplication {
    // Private constructor to prevent instantiation
    private DevopsTrainingApplication() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static void main(final String[] args) {
        SpringApplication.run(DevopsTrainingApplication.class, args);
    }
}