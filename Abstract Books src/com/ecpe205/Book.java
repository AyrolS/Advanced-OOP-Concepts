package com.ecpe205;

public abstract class Book {
    String title;
    double bookPrice;

    public Book(String x) {
        this.title = x;
    }

    public String getTitle() {
        return this.title;
    }

    public double getBookPrice() {
        return this.bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
}
