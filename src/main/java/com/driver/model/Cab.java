package com.driver.model;


import javax.persistence.*;

@Entity
@Table
public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int perKmRate;
    private Boolean available;

    // maping tables
    @OneToOne(mappedBy = "cab", cascade = CascadeType.ALL)
    private Driver driver;


    // Constructor
    public Cab(){
    }
    public Cab(int perKmRate) {
        this.perKmRate = perKmRate;
    }
    public Cab(int id, int perKmRate ,Boolean available) {
        this.id = id;
        this.perKmRate = perKmRate;
        this.available = available;
    }


   // Getter & Setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getPerKmRate() {
        return perKmRate;
    }
    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public Boolean getAvailable() {
        return available;
    }
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Driver getDriver() {
        return driver;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}