package com.ecpe205;

public class Square extends GeometricFigure{

    public Square(int w,int h, String f){
        super(h,w,f);
    }
    @Override
    public double figureArea(int h, int w) {
        return w*h;
    }
}
