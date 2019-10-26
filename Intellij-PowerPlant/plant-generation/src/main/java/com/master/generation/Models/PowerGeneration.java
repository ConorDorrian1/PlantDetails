package com.master.generation.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "powergeneration") //which takes some values like the name you are going to name your table
public class PowerGeneration {

    @Id   //denotes that the id is the primary key / identifying key for this table
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String plantName;
    private String primaryFuel;
    private String otherFuel;
    private String powerGeneration;

    public PowerGeneration () { }

    public PowerGeneration(String plantName, String primaryFuel, String otherFuel, String powerGeneration) {
        this.plantName = plantName;
        this.primaryFuel = primaryFuel;
        this.otherFuel = otherFuel;
        this.powerGeneration = powerGeneration;
    }

    public PowerGeneration(Integer Id, String plantName, String primaryFuel, String otherFuel, String powerGeneration){ //
        super(); // will get no data if this is missing, test this again (Conclusion)
        this.Id = Id;
        this.plantName = plantName;
        this.primaryFuel = primaryFuel;
        this.otherFuel = otherFuel;
        this.powerGeneration = powerGeneration;
    }

    public PowerGeneration(Integer id, int i) {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public String getPrimaryFuel() {
        return primaryFuel;
    }

    public void setPrimaryFuel(String primaryFuel) {
        this.primaryFuel = primaryFuel;
    }

    public String getOtherFuel() {
        return otherFuel;
    }

    public void setOtherFuel(String otherFuel) {
        this.otherFuel = otherFuel;
    }

    public String getPowerGeneration() {
        return powerGeneration;
    }

    public void setPowerGeneration(String powerGeneration) {
        this.powerGeneration = powerGeneration;
    }

    @Override
    public String toString() {
        return "PowerGeneration{" +
                "Id=" + Id +
                ", plantName='" + plantName + '\'' +
                ", primaryFuel='" + primaryFuel + '\'' +
                ", otherFuel='" + otherFuel + '\'' +
                ", powerGeneration=" + powerGeneration +
                '}';
    }
}
