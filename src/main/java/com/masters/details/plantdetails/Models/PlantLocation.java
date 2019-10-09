package com.masters.details.plantdetails.Models;

import javax.persistence.*;

@Entity //used to denote that this class is going to be an Entity in the database.
@Table(name = "plantlocation") //which takes some values like the name you are going to name your table
public class PlantLocation {

    @Id   //denotes that the id is the primary key / identifying key for this table
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String country;
    private double latitude;
    private double longitude;

    public PlantLocation() {  }

    public PlantLocation(String country, double latitude, double longitude) {
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public PlantLocation(Integer Id, String country, double latitude, double longitude){
        super();
        this.Id=Id;
        this.country=country;
        this.latitude=latitude;
        this.longitude=longitude;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "PlantLocation{" +
                "Id=" + Id +
                ", country='" + country + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
