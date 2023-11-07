/*
 * Main class to check your problems
 * 
 */

import java.util.Arrays;

public class Main {
    
    public static boolean problem1Check() {

        int[] test1 = {30, 30, 27, 27};
        int[] test2 = {30, 35, 30, 35};

        boolean test1Check = Problem1.stickerCheck(test1[0], test1[1], test1[2], test1[3]);
        boolean test2Check = Problem1.stickerCheck(test2[0], test2[1], test2[2], test2[3]);

        if (test1Check && !test2Check) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean problem2Check() {
        String[] students = {"Chris", "Sam", "Michael", "Cole", "Avery", "Corey", "Tina"};
        int[] test1 = {100, 99, 97, 82, 94, 62, 96};
        int[] test2 = {100, 97, 92, 84, 92, 64, 96};
        int[] test3 = {100, 94, 90, 87, 95, 73, 96};

        char[] letterGrades = Problem2.problem2(students, test1, test2, test3);
        char[] rubric = {'A', 'B', 'A', 'B', 'A', 'D', 'A'};

        if (Arrays.equals(letterGrades, rubric)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        boolean prob1 = problem1Check();
        if (prob1) {
            System.out.println("Problem 1 is correct!");
        } else {
            System.out.println("Problem 1 does not pass all test cases. Try again!");
        }
        boolean prob2 = problem2Check();
        if (prob2) {
            System.out.println("Problem 2 is correct!");
        } else {
            System.out.println("Problem 2 does not pass all test cases. Try again!");
        }
    }
}
