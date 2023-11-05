import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors

public class Generator {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("testInput/input4.txt");
            //generate test for problem 4
            int n = (int)(Math.random() * 100);
            myWriter.write(n + "\n");
            for (int i = 0; i < n; i++) {
                int x = (int)(Math.random() * 100);
                myWriter.write(x + "\n");
                for(int j = 0; j < x; j++) {
                    String cityName = "";
                    int nameLength = (int)(Math.random() * 19) + 1;
                    for(int k = 0; k < nameLength; k++) {
                        int ascii = (int)(Math.random() * 26) + 97;
                        cityName += (char)ascii;
                    }
                    //0.4 chance of being written twice
                    if(Math.random() < 0.4) {
                        myWriter.write(cityName + "\n");
                        j++;
                    } else if(Math.random() < 0.1) {
                        myWriter.write(cityName + "\n" + cityName + "\n");
                        j += 2;
                    }

                    myWriter.write(cityName + "\n");
                   
                    
                }
            }
           
            
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}