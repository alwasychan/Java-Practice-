

import java.io.File;


public class Sitakundo {
    public static void main(String[] args) {
        
        File dir = new File("person");
        dir.mkdir();
        String dirlocation = dir.getAbsolutePath();
        System.out.println(dirlocation);
    }
    
}
