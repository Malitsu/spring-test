package com.example.demo;

import javax.persistence.*;
@Entity
public class Circle {
    @Id
    // Classes must have some id
    // IDENTIFY allow auto increment on demand in MySQL
    //    PRIMARY KEY AUTOINCREMENT ...
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
 
    private double radius;
 
    public void setRadius(int r) {
        radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public String toString() {
        return "Circle number " +getId() +" has radius of " +getRadius();
    }
}