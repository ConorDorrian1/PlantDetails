package com.masters.details.plantdetails.Contoller;

import com.masters.details.plantdetails.Models.PlantDetails;
import com.masters.details.plantdetails.Repository.PlantDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.print.Book;
import java.security.acl.Owner;
import java.util.List;
import java.util.Map;

//This Class contains the endpoint
@RestController//("/demo") // This means URL's start with /demo (after Application path)
public class PlantDetailsController {

    @Autowired //@Autowired will automatically resolve the instance and inject it into the class that declared it.
    private PlantDetailsRepository plantdetailsrepo;

    @GetMapping("/all") //get all details
    public List<PlantDetails> getAllPlants() {
        return plantdetailsrepo.findAll();
    }

    @PostMapping("all/add") // Map ONLY POST Requests
    public @ResponseBody String addNewPowerPlant (@RequestParam Integer Id
            , @RequestParam String plantName, @RequestParam String owner, @RequestParam Integer yearCommissioned ) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        PlantDetails pd = new PlantDetails();
        pd.setId(Id);
        pd.setPlantName(plantName);
        pd.setOwner(owner);
        pd.setYearCommissioned(yearCommissioned);
        plantdetailsrepo.save(pd);
        return "Saved";
    }

//    @RequestMapping(method = RequestMethod.POST){
//        public PlantDetails
//    }

//    @PostMapping
//    public PlantDetails create(@RequestBody PlantDetails plantdetails) { //@RequestBody annotation indicates a method parameter should be bound to the body of the web request.
//        // The method expects the following content from que request (in JSON format):
//        return plantdetailsrepo.save(plantdetails);
//    }

//    //Single power plant from ID
//    @GetMapping("/all/{id}") //select * from plantdetails where id = 29907
//    public PlantDetails getPowerPlantId(@PathVariable(value = "Id") Integer detailsId) throws PowerPlantNotFoundException {
//        return plantdetailsrepo.findById(detailsId)  ////@PathVariable binds the method parameter id with the path variable \{id}.
//                .orElseThrow(() -> new PowerPlantNotFoundException(detailsId));
//    }

//    @GetMapping({"/all/{id}"})
//    @ResponseBody
//    public ResponseEntity<PlantDetails> findById(@PathVariable Integer id) {  //@PathVariable binds the method parameter id with the path variable \{id}.
//        return plantdetailsrepo.findById(id)
//                .map(record -> ResponseEntity.ok().body(record))
//                .orElse(ResponseEntity.notFound().build());
//    }

//    // Create a new power plant
//    @PostMapping("/all/add")
//    public PlantDetails createPowerPlant(@Valid @RequestBody PlantDetails pd){
//        return plantdetailsrepo.save(pd);
//    }


//    //Get a single power plant details
//    @GetMapping("/all/{id}")
//    public PlantDetails powerPlantId(@PathVariable(value = "id") Integer detailsId) throws PowerPlantNotFoundException{
//        return plantdetailsrepo.findById(detailsId)
//                .orElseThrow(() -> new PowerPlantNotFoundException(detailsId));
//    }

    // Delete a power plant information
//    @DeleteMapping("/all/delete/{id}")
//    public ResponseEntity<?> deleteBook(@PathVariable(value = "id") Integer detailsId) throws PowerPlantNotFoundException {
//        PlantDetails plantdetails = plantdetailsrepo.findById(detailsId)
//                .orElseThrow(() -> new PowerPlantNotFoundException(detailsId));
//
//        plantdetailsrepo.delete(plantdetails);
//
//        return ResponseEntity.ok().build();
//    }

//    @RequestMapping(value="/delete/id/{id}",method={RequestMethod.GET,RequestMethod.DELETE})
//    public Map<String,String> deletePowerPlant(@PathVariable("Id") Integer Id) throws PowerPlantNotFoundException {
//        PlantDetailsRepository.deletePowerPlant(Id);


    //Delete a power plant
//    @DeleteMapping("/all/delete/{id}")
//    public ResponseEntity<?> deleteBook(@PathVariable(value = "Id") Integer powerplantid) throws PowerPlantNotFoundException {
//        PlantDetails powerPlant = plantdetailsrepo.findById(powerplantid)
//                .orElseThrow(() -> new PowerPlantNotFoundException(powerplantid));
//
//        plantdetailsrepo.delete(powerPlant);
//        System.out.println("Deleted:" + powerPlant);
//        return ResponseEntity.ok().build();
//    }
}

