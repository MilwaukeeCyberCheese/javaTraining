import java.io.File;
import java.util.Scanner;

/*
 * Alice travels a lot for her work. Each time she travels, she visits a single
 * city before returning home.
 * Someone recently asked her “how many different cities have you visited for
 * work?” Thankfully Alice has kept a log of her trips. Help Alice figure out
 * the number of cities she has visited at least once.
 * 
 * Input
 * The first line of input contains a single positive integer T <= 100 indicating the
 * number of test cases. The first line of each test case also contains a single
 * positive integer indicating the number of work trips Alice has taken so far.
 * The following lines describe these trips. The nth such line simply contains
 * the name of the city Alice visited on her nth trip.
 * 
 * Alice’s work only sends her to cities with simple names: city names only
 * contain lowercase letters, have at least one letter, and do not contain
 * spaces.
 * 
 * The number of trips is at most 100 and no city name contains more than 20
 * characters.
 * 
 * Output
 * Output an array the number of distinct cities Alice has visited, in order of the test case.
 */

/*
 * Hints:
 * 
 * 1. Use a linked list to keep track of the cities Alice has visited so far.
 * 2. Use the Scanner class to read the input from a file.
 */

public class Problem4 {
    public static int[] Alice() {
        File file = new File("PATH_TO_FILE");

        try {
            Scanner sc = new Scanner(file);
            int num = sc.nextInt();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new int[1];
    }
}