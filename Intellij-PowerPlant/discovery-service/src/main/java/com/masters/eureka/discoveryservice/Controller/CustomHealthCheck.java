package com.masters.eureka.discoveryservice.Controller;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

@Component
public class CustomHealthCheck implements HealthIndicator {

    @Override
    public Health health() {
        try(Stream<Path> paths = Files.walk(Paths.get("C:/Users/Conor Dorrian/Desktop/Intellij-PowerPlant"))){ //accessing folder
            paths.filter(Files::isRegularFile)
                    .forEach(System.out::println);  //printing the files
            return Health.up().build(); //if all files healthy will return build up
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();  //stack error
            return Health.down().withDetail("FileAccess", "N").build(); //If unhealthy, It will show build down
        }
    }
}
