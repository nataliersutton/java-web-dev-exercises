package org.launchcode.java.studios.createamenu;

import java.util.Date;

public class MenuItem {

    private double price;
    private String description;
    private String category;
    private Date date;

    //Constructor
    public MenuItem (double price, String description, String category, Date date) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.date = date;
    }

    //Getters

    public double getPrice() {
        return this.price;
    }
    public String getDescription() {
        return this.description;
    }
    public String getCategory() {
        return this.category;
    }
    public Date getDate() {
        return this.date;
    }

    //Setters

    public void setPrice(double price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setAdded(Date date) {
        this.date = date;
    }

}
