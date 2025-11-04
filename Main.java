package hikikomori;

import java.util.Scanner;

class Rectangle {
    private double height;
    private double width;

   
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }


    public double get_height() {
        return height;
    }

    
    public double get_width() {
        return width;
    }

    
    public void set_value(double height, double width) {
        this.height = height;
        this.width = width;
    }
}

class Area { 
    public double calc_area(Rectangle rect) {
        return rect.get_height() * rect.get_width();
    }
}


public class Main { 
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Enter the height of rectangle: ");
        double height = scnr.nextDouble();
        
        System.out.println("Enter the width of rectangle: ");
        double width = scnr.nextDouble();
             
        Rectangle rectangle = new Rectangle(height, width);
          
        Area areaCalculator = new Area(); 
        
        double calculatedArea = areaCalculator.calc_area(rectangle);
        
        System.out.println("The Area of the rectangle is: " + calculatedArea);
        
        scnr.close();
    }
}