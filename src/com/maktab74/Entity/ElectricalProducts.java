package com.maktab74.Entity;

public class ElectricalProducts {
    private int id;
    private String type;
    private String brand;
    private String model;
    private String description;
    private String size;
    private String otherfeatures;

    public ElectricalProducts() {
    }

    public ElectricalProducts(String type, String brand, String model, String description, String size, String otherfeatures) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.description = description;
        this.size = size;
        this.otherfeatures = otherfeatures;
    }

    public ElectricalProducts(int id, String type, String brand, String model, String description, String size, String otherfeatures) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.description = description;
        this.size = size;
        this.otherfeatures = otherfeatures;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getOtherfeatures() {
        return otherfeatures;
    }

    public void setOtherfeatures(String otherfeatures) {
        this.otherfeatures = otherfeatures;
    }
}
