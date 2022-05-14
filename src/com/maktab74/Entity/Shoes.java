package com.maktab74.Entity;

public class Shoes extends Products {
    private String type;
    private String size;
    private String brand;
    private String description;

    public Shoes() {
    }

    public Shoes(String type, String size, String brand, String description) {
        this.type = type;
        this.size = size;
        this.brand = brand;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
