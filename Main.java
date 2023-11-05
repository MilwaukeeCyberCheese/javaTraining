/*
 * Main class to check your problems
 * 
 */

public class Main {

    /*
     * public static boolean problem1Check() {
     * 
     * }
     * 
     * public static boolean problem2Check() {
     * 
     * }
     */

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
        } else if (Problem3.sodaAnswer(test3[0], test3[1], test3[2]) != 10) {
            return false;
        } else if (Problem3.sodaAnswer(test4[0], test4[1], test4[2]) != 12) {
            return false;
        } else if (Problem3.sodaAnswer(test5[0], test5[1], test5[2]) != 904) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean problem4Check() {
        int[] solution = { 28, 29, 10, 7, 13, 16, 20, 18, 19, 25, 62, 5, 59, 49, 51, 62, 40, 56, 54, 57, 49, 19, 21, 36, 10, 5, 20, 60, 31, 48, 50, 30, 38, 41, 65, 2, 19, 1, 54, 12, 49, 27, 54, 30, 57, 25, 15, 25, 36, 23, 66, 10, 21, 59, 8, 41, 30, 30, 27, 31, 58, 34, 5, 17, 3, 47, 36, 34, 58, 28, 21, 58, 48, 4, 25, 14, 55, 15 };

        int[] answer = Problem4.Alice();

        return solution.equals(answer);

    }

    public static void main(String[] args) {

    }
}
