package com.company;

public class bookDatabase{

    private String SKU;
    private String title;
    private String author;
    private String description;
    private double price;
    private String PPrice;

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;

    }
    public String getPPice(){
        return PPrice;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

