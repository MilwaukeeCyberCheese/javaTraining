import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors

public class Generator {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("testInput/input3.txt");
            //generate test for problem 3
            for(int i = 0; i < 100; i++){
                int e = (int)(Math.random() * 1000);
                int f = (int)(Math.random() * 1000);
                int c = (int)(Math.random() * 2000) + 2;
                myWriter.write(e + " " + f + " " + c + "\n");
            }
            
           
            
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}