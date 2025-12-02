







import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        try{
            File myfile = new File("abc.txt");
            myfile.createNewFile();
            FileWriter my = new FileWriter(myfile);
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number :");
            
            int n = in.nextInt();
            for(int i = 0; i < n; i++){
                String coursecode = in.next();
                String score = in.next();
            }
            
            my.close();
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                String coursecode = in.next();
                String score = in.next();
                System.out.println(coursecode + score);
               
            }
            
            
        } catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
