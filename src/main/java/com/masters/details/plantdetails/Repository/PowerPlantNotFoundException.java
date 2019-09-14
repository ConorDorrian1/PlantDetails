package com.masters.details.plantdetails.Repository;

public class PowerPlantNotFoundException extends Exception {

    private Integer detailsId;

    public PowerPlantNotFoundException(Integer detailsId){
        super(String.format("Plant Details are not found with id:  '%s'", detailsId));
    }
}
