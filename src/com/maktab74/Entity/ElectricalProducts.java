package com.maktab74.Entity;

public class ElectricalProducts extends Products {
    private String type;
    private String brand;
    private String model;
    private String description;
    private String otherfeatures;

    public ElectricalProducts() {
    }

    public ElectricalProducts(String type, String brand, String model, String description, String otherfeatures) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.description = description;
        this.otherfeatures = otherfeatures;
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

    public String getOtherfeatures() {
        return otherfeatures;
    }

    public void setOtherfeatures(String otherfeatures) {
        this.otherfeatures = otherfeatures;
    }

    @Override
    public String toString() {
        return "ElectricalProducts{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", description='" + description + '\'' +
                ", otherfeatures='" + otherfeatures + '\'' +
                '}';
    }
}
