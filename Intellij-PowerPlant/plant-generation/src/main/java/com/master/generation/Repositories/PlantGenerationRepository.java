package com.master.generation.Repositories;

import com.master.generation.Models.PowerGeneration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantGenerationRepository extends JpaRepository<PowerGeneration, Integer> {
}
