import java.io.File;

public class Potenga {
    public static void main(String[] args) {
        try {
            
            File myObj = new File("E:\\CD\\Jidiagong\\src\\Potenga.java\\abc.txt");
            
           
            // File myObj = new File("E:/CD/Jidiagong/src/Potenga.java/abc.txt");
            
            File my = new File("abc.txt");
            my.createNewFile();
            System.out.println(my.exists());
            System.out.println(my.getName());
            System.out.println(my.getAbsolutePath());
            System.out.println(my.length());
            
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}