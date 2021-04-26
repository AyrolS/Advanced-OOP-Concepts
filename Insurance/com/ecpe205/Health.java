package com.ecpe205;

import javax.swing.*;

public class Health extends Insurance{

    public Health(){
        super("HEALTH");
        setCost();
    }

    double healthCost = 196;
    @Override
    void setCost(){
        monthylPrice = healthCost;
    }

    @Override
    void display(){
        JOptionPane.showMessageDialog(null,"Insurance Type you selected is: " + getType() +" Costing $" +getPrice()+" per month");
    }
}
