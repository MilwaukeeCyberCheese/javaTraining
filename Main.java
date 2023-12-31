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

        int[] test1 = { 30, 30, 27, 27 };
        int[] test2 = { 30, 35, 30, 35 };
        int[] test3 = { 30, 30, 29, 29 };
        int[] test4 = { 923, 234, 900, 233 };

        if (Problem1.stickerCheck(test1[0], test1[1], test1[2], test1[3])
                && !Problem1.stickerCheck(test2[0], test2[1], test2[2], test2[3])
                && !Problem1.stickerCheck(test3[0], test3[1], test3[2], test3[3])
                && !Problem1.stickerCheck(test4[0], test4[1], test4[2], test4[3])) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean problem2Check() {
        String[] students = { "Chris", "Sam", "Michael", "Cole", "Avery", "Corey", "Tina" };
        int[] test1 = { 100, 99, 97, 82, 94, 62, 96 };
        int[] test2 = { 100, 97, 92, 84, 92, 64, 96 };
        int[] test3 = { 100, 94, 90, 87, 95, 73, 96 };

        char[] letterGrades = Problem2.problem2(students, test1, test2, test3);

        if (Arrays.equals(letterGrades, new String(Base64.getDecoder().decode("QUFBQkFEQQ==")).toCharArray())) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean problem3Check() {

        int[][] tests = { { 9, 0, 3 }, { 5, 5, 2 }, { 7, 8, 3 }, { 9, 9, 3 }, { 840, 248, 27 } };

        int[] answers = Arrays.stream(new String(Base64.getDecoder().decode("NCw5LDcsOCw0MQ==")).split(","))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < tests.length; i++) {

            if (Problem3.sodaAnswer(tests[i][0], tests[i][1], tests[i][2]) == answers[i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean problem4Check() {

        int[] answer = Problem4.Alice();
        if (Arrays.equals(answer, Arrays.stream(new String(Base64.getDecoder().decode(
                "MjgsMjksMTAsNywxMywxNiwyMCwxOSwyMCwyNiw2Myw1LDYxLDQ5LDUyLAo2Myw0MCw2MSw1NSw1OSw1MSwyMCwyNCwzOCwKMTAsNSwyMCw2NiwzNCw0OCw1MSwzNCw0Miw0Myw2OCwyLDE5LDEsNTYsMTIsNTMsMjksNjEsMzIsCjU4LDI3LDE2LDI4LDQwLDI0LDcxLAoxMiwyNCw2MCw4LDQ1LDMyLDMwLDI4LDM4LDYxLDM1LDYsMTcsMyw0OSwzOSwzNCw2MCwyOCwyMywKNjAsNTIsNCwyNSwxNiw2MCwxNg=="))
                .split(","))
                .mapToInt(Integer::parseInt).toArray())) {

            return true;
        } else {
            return false;
        }

    }

    public static boolean problem5Check() {
        LinkedList<Integer> solution = new LinkedList<Integer>();
        File file = new File("solutions/solution5Commas.txt");

        try {
            Scanner in = new Scanner(file);

            int[] nextInt = Arrays.stream(new String(Base64.getDecoder().decode(in.nextLine())).split(","))
                    .mapToInt(Integer::parseInt).toArray();

            for (int num : nextInt) {
                solution.add(num);
            }

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        LinkedList<Integer> answer = Problem5.bases();

        return solution.equals(answer);
    }

    public static void main(String[] args) {
        if (problem1Check()) {
            System.out.println("You've succesfully completed problem 1");
        } else {
            System.out.println("Problem 1 does not pass all test cases. Try again!");
        }
        if (problem2Check()) {
            System.out.println("You've succesfully completed problem 2");
        } else {
            System.out.println("Problem 2 does not pass all test cases. Try again!");
        }
        if (problem3Check()) {
            System.out.println("You've succesfully completed problem 3");
        } else {
            System.out.println("Problem 3 does not pass all test cases. Try again!");
        }
        if (problem4Check()) {
            System.out.println("You've succesfully completed problem 4");
        } else {
            System.out.println("Problem 4 does not pass all test cases. Try again!");
        }
        if (problem5Check()) {
            System.out.println("You've succesfully completed problem 5");
        } else {
            System.out.println("Problem 5 does not pass all test cases. Try again!");
        }
    }
}
