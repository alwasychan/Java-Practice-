
import java.io.File;


public class Nijika {
    
    public static void main(String[] args) {
        try{
            File my = new File("person");
            my.createNewFile();
            if(my.delete()){
                System.out.println("deleted" + my.getName());
            } else{
                System.out.println("Not Possible");
            }
        } catch(Exception e){
            
            System.out.println(e);
        }
    }

}
