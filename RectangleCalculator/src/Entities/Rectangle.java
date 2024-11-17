package Entities;

import java.util.Scanner;

public class Rectangle  {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area(){
        // A = b * h
        return width * height;
    }

    public double perimeter(){
        //P = 2 * (b + h)
        return 2 * (width+height);
    }

    public double diagonal(){
        // D = sqrt(b^2 + h^2)
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }


    @Override
    public String toString() {
        return String.format("\nAREA = %.2f \nPERIMETER = %.2f \nDIAGONAL = %.2f", area(), perimeter(), diagonal());
    }
}
