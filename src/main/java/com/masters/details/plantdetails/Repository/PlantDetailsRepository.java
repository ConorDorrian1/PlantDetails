package com.masters.details.plantdetails.Repository;

import com.masters.details.plantdetails.Models.PlantDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  //Used to Indicate the DAO (Data Access Object) component in the persistence layer.
public interface PlantDetailsRepository extends JpaRepository<PlantDetails, Integer> {
    /*
     Importing the JpaRepository package in this repository in the PlantDetailsRepository interface
     by connecting coded PlantDetails model so I can use CRUD operations on mySQL.
     */
}
