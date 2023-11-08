import java.io.File;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * Main class to check your problems
 * 
 */


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
        

        if (Arrays.equals(letterGrades, new String(Base64.getDecoder().decode("QUJBQkFEQQ==")).toCharArray())) {
            return true;
        } else {
            return false;
        }
        
    }

    public static boolean problem3Check() {
        int[] test = { 9, 0, 3 };
        int[] test2 = { 5, 5, 2 };
        int[] test3 = { 7, 8, 3 };
        int[] test4 = { 9, 9, 3 };
        int[] test5 = { 840, 248, 27 };

        if (Problem3.sodaAnswer(test[0], test[1], test[2]) != 4) {
            return false;
        } else if (Problem3.sodaAnswer(test2[0], test2[1], test2[2]) != 9) {
            return false;
        } else if (Problem3.sodaAnswer(test3[0], test3[1], test3[2]) != 7) {
            return false;
        } else if (Problem3.sodaAnswer(test4[0], test4[1], test4[2]) != 8) {
            return false;
        } else if (Problem3.sodaAnswer(test5[0], test5[1], test5[2]) != 41) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean problem4Check() {
        int[] solution = { 28, 29, 10, 7, 13, 16, 20, 18, 19, 25, 62, 5, 59, 49, 51, 62, 40, 56, 54, 57, 49, 19, 21, 36,
                10, 5, 20, 60, 31, 48, 50, 30, 38, 41, 65, 2, 19, 1, 54, 12, 49, 27, 54, 30, 57, 25, 15, 25, 36, 23, 66,
                10, 21, 59, 8, 41, 30, 30, 27, 31, 58, 34, 5, 17, 3, 47, 36, 34, 58, 28, 21, 58, 48, 4, 25, 14, 55,
                16 };

        int[] answer = Problem4.Alice();

        return solution.equals(answer);

    }

    public static boolean problem5Check() {
        LinkedList<Integer> solution = new LinkedList<Integer>();

        File file = new File("solutions/solution5.txt");
        try {
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                solution.add(in.nextInt());
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        LinkedList<Integer> answer = Problem5.bases();

        return solution.equals(answer);
    }

    public static void main(String[] args) {
        // if(problem1Check()){
        //     System.out.println("You've succesfully completed problem 1");
        // } else{
        //     System.out.println("Problem 1 does not pass all test cases. Try again!");
        // }
        if(problem2Check()){
            System.out.println("You've succesfully completed problem 2");
        } else{
            System.out.println("Problem 2 does not pass all test cases. Try again!");
        }
        // if(problem3Check()){
        //     System.out.println("You've succesfully completed problem 3");
        // } else{
        //     System.out.println("Problem 3 does not pass all test cases. Try again!");
        // }
        // if(problem4Check()){
        //     System.out.println("You've succesfully completed problem 4");
        // } else{
        //     System.out.println("Problem 4 does not pass all test cases. Try again!");
        // }
        // if(problem5Check()){
        //     System.out.println("You've succesfully completed problem 5");
        // } else{
        //     System.out.println("Problem 5 does not pass all test cases. Try again!");
        // }
    }
}
