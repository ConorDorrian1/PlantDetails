package com.masters.details.plantdetails.Models;

import java.util.ArrayList;
import java.util.List;

public class PlantDetailsStorage {
    private List<PlantDetails> plantDetails = new ArrayList<>();

    public void add(PlantDetails plantDetail) {
        plantDetails.add(plantDetail);
    }

    public void clear() {
        plantDetails.clear();
    }

    public List<PlantDetails> getAll() {
        return plantDetails;
    }
}
