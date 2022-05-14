package com.maktab74.Entity;

public class Products {
    private int id;
    private double price;

    public Products() {
    }

    public Products(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}
