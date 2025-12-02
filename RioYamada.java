

import java.io.FileWriter;


public class RioYamada {
    public static void main(String[] args) {
        try{
            FileWriter my = new FileWriter("abc.txt");
            my.write("Owari da....");
            my.close();
            System.out.println("Successfully wrote the file");
        } catch (Exception e){
            System.out.println(e);
        }
    
    }
}
