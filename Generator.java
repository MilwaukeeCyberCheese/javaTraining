import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors

public class Generator {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("testInput/input5.txt");
            //generate test for problem 5
            for(int i = 0; i < 999; i++){
                int b = (int)(Math.random() * 9) + 2;
                String p = "";
                int pLength = (int)(Math.random() * 1000);
                for(int j = 0; j < pLength; j++){
                    p += (int)(Math.random() * b);
                }
                String m = "";
                int mLength = (int)(Math.random() * 9);
                for(int j = 0; j < mLength; j++){
                    m += (int)(Math.random() * (b - 1)) + 1;
                }
                myWriter.write(b + " " + p + " " + m + "\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}