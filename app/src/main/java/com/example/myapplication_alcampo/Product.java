package com.example.myapplication_alcampo;

public class Product {
    int id;
    int image;
    String name;
    String brand;
    String price;
    float valuation;

    String description;

    public Product(int id, int image, String name, String brand, String price, float valuation, String description) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.valuation = valuation;
        this.description = description;
    }

    public Product(int id, int image, String name, String brand, String price, float valuation) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.valuation = valuation;
    }

    public Product(int image, String name, String brand, String price, float valuation) {
        this.image = image;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.valuation = valuation;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public float getValuation() {
        return valuation;
    }

    public void setValuation(float valuation) {
        this.valuation = valuation;
    }
}
