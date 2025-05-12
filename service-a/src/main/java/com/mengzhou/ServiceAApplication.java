package com.mengzhou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@SpringBootApplication
public class ServiceAApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(ServiceAApplication.class, args);

        Environment env = context.getEnvironment();
        String[] activeProfiles = env.getActiveProfiles();

        System.out.println("=== Active Spring Profiles: " + Arrays.toString(activeProfiles));
    }
}


