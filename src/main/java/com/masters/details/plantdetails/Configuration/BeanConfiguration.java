package com.masters.details.plantdetails.Configuration;

import com.masters.details.plantdetails.Models.PlantDetailsStorage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public PlantDetailsStorage pdStorage() {
        return new PlantDetailsStorage();
    }
}
