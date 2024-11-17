package Application;

import Entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        double width, height;
        Rectangle rectangle = new Rectangle();
        requestData(rectangle, read);
        System.out.println(rectangle);

        read.close();
    }

    public static void requestData(Rectangle rectangle, Scanner read) {
        System.out.println("Enter rectangle width and height");

        double width;
        do {
            System.out.print("Enter width (positive value): ");
            width = read.nextDouble();
        } while (width <= 0);
        rectangle.setWidth(width);

        double height;
        do {
            System.out.print("Enter height (positive value): ");
            height = read.nextDouble();
        } while (height <= 0);
        rectangle.setHeight(height);
    }
}