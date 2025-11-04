package hikikomori;

public class Rectangle {
    
    double length, breadth;
    
    public Rectangle(){
        this(0,0);
    }
    
    public Rectangle(double side){
        this(side, side);
    }
    
    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    public double calculateArea(){
        return length * breadth;
    }
    
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4,6);
        
        System.out.println("Area without paraemters: " + r1.calculateArea());
        System.out.println("Area with 1 paramter:  " + r2.calculateArea());
        System.out.println("Area with 2 parameters: " + r3.calculateArea());
    }
    
}
