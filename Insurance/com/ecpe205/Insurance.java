package com.ecpe205;

public abstract class Insurance {

    String insuranceType;
    double monthylPrice;

    public Insurance (String Insurancetype) {
        insuranceType = Insurancetype;
    }

    public String getType() {
        return insuranceType;
    }

    public double getPrice() {
        return monthylPrice;
    }

    abstract void setCost();
    abstract void display();
}
