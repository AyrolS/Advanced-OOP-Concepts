package com.ecpe205;

public class UseGeometric {

    public static void main(String[] args) {
        double area;
        int height;
        int width;
        String figureType;

        GeometricFigure[] figure = new GeometricFigure[2];
        Square f0 = new Square(5,5, "Square");
        Triangle f1 = new Triangle(5,5,"Triangle");

        figure[0] = f0;
        figure[1] = f1;

        for (int x = 0; x<figure.length;++x) {

            height = figure[x].getHeight();
            width = figure[x].getWidth();
            figureType = figure[x].getFigure();
            area = figure[x].figureArea(height, width);

            System.out.println("The " + figureType + " with height = " + height + " and width = " + width + " has an area of " + area);
        }
    }
}