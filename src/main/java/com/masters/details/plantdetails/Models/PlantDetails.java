package com.masters.details.plantdetails.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //used to denote that this class is going to be an Entity in the database.
@Table(name = "plantdetails") //which takes some values like the name you are going to name your table
public class PlantDetails {
    @Id   //denotes that the id is the primary key / identifying key for this table
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id; //Primary Key
    private String plantName;
    private String owner;
    private Integer yearCommissioned;

    public PlantDetails() {  }

    //This constructor will be used when I supply form data to the controller.
    public PlantDetails(String plantName, String owner, Integer yearCommissioned) {//new
        this.setPlantName(plantName);
        this.setOwner(owner);
        this.setYearCommissioned(yearCommissioned);
    }

    public PlantDetails(Integer Id, String plantName, String owner, Integer yearCommissioned) {
        super();
        this.Id = Id;
        this.plantName = plantName;
        this.owner = owner;
        this.yearCommissioned = yearCommissioned;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getYearCommissioned() {
        return yearCommissioned;
    }

    public void setYearCommissioned(Integer yearCommissioned) {
        this.yearCommissioned = yearCommissioned;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    @Override
    public String toString() {//new
        return "PlantDetails{" +
                "Id=" + Id +
                ", plantName='" + plantName + '\'' +
                ", owner='" + owner + '\'' +
                ", yearCommissioned=" + yearCommissioned +
                '}';
    }
}
