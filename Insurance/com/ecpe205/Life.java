package com.ecpe205;

import javax.swing.*;

public class Life extends Insurance{

    public Life(){
        super("LIFE");
        setCost();
    }

    double lifeCost = 36;
    @Override
    void setCost(){
        monthylPrice = lifeCost;
    }

    @Override
    void display(){
        JOptionPane.showMessageDialog(null,"Insurance Type you selected is: " + getType() +" Costing $" +getPrice()+" per month");
    }
}