import java.io.*;

public class ThrowsExample {
    static void readFile() throws IOException {
        FileReader fr = new FileReader("test.txt");
        fr.close(); 
    }
    
    public static void main(String[] args) {
        try {
            readFile();
            System.out.println("File found successfully!");
        } catch (IOException e) {
            System.out.println("File not found or Error reading file!!");
        }
    }
}