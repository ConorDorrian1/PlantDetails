package com.masters.details.plantdetails.Contoller;

import com.masters.details.plantdetails.Models.PlantDetails;
import com.masters.details.plantdetails.Repository.PlantDetailsRepository;
import com.masters.details.plantdetails.Repository.PowerPlantNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

//This Class contains the endpoint
@RestController
public class PlantDetailsController {

    @Autowired //@Autowired will automatically resolve the instance and inject it into the class that declared it.
    PlantDetailsRepository plantdetailsrepo;

    //new
//    @GetMapping("/blog")
//    public List<PlantDetails> index(){
//        return plantdetailsrepo.findAll();
//    }

    // Get All power plant details
    @GetMapping("/plantdetails")
    public List<PlantDetails> getAllPowerPlants() {
        return plantdetailsrepo.findAll();
    }

    // Create a new power plant
    @PostMapping("/add")
    public PlantDetails createPowerPlant(@Valid @RequestBody PlantDetails pd){
        return plantdetailsrepo.save(pd);
    }

    //Get a single power plant details
    @GetMapping("/plant/{id}")
    public PlantDetails powerPlantId(@PathVariable(value = "id") Integer detailsId) throws PowerPlantNotFoundException{
        return plantdetailsrepo.findById(detailsId)
                .orElseThrow(() -> new PowerPlantNotFoundException(detailsId));
    }

    // Delete a power plant information
    @DeleteMapping("/plantdetails/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable(value = "id") Integer detailsId) throws PowerPlantNotFoundException {
        PlantDetails plantdetails = plantdetailsrepo.findById(detailsId)
                .orElseThrow(() -> new PowerPlantNotFoundException(detailsId));

        plantdetailsrepo.delete(plantdetails);

        return ResponseEntity.ok().build();
    }
}
