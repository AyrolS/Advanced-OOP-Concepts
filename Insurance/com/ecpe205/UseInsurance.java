package com.ecpe205;

import javax.swing.*;

public class UseInsurance {

    public static void main(String[] args) {
        int choice = 0;

        do{
            String option = JOptionPane.showInputDialog(null, "What insurance type do you want to see? Input 1 for Life and 2 for Health");
            int options = Integer.parseInt(option);

            if (options == 1) {
                Life x = new Life();
                x.display();
                JOptionPane.showMessageDialog(null, "Thank you for your time");
                System.exit(0);
            }
            if (options == 2) {
                Health y = new Health();
                y.display();
                JOptionPane.showMessageDialog(null, "Thank you for your time");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Try to input again", "INCORRECT", JOptionPane.ERROR_MESSAGE);
                choice = JOptionPane.showConfirmDialog(null, "Do you want to try again? ");
            }

            if(choice == JOptionPane.YES_OPTION){
                choice = choice+2;
            }
            else if (choice == JOptionPane.NO_OPTION){
                System.exit(0);
            }
        }while(choice == 2);
    }
}
