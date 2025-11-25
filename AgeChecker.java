
import java.util.Scanner;

class AgeException extends Exception{
    public AgeException(String msg){
        super(msg);
    }
}
public class AgeChecker{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your age: ");
        
        int age = scnr.nextInt();
        try{
            if(age< 18){
                throw new AgeException("Age is less than 18. You're not eligible!");
            }
            else{
                System.out.println("You're Eligible!");
            }
        }
        
        catch(AgeException e){
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}