/*
 * Main class to check your problems
 * 
 */

public class Main {
    
    /*public static boolean problem1Check() {

    }

    public static boolean problem2Check() {

    }*/

    public static boolean problem3Check(){
        int[] test = {9, 0, 3};
        int[] test2 = {5, 5, 2};
        int[] test3 = {7, 8, 3};
        int[] test4 = {9, 9, 3};
        int[] test5 = {840, 248, 27};


        if(Problem3.sodaAnswer(test[0], test[1], test[2]) != 4){
            return false;
        } else if(Problem3.sodaAnswer(test2[0], test2[1], test2[2]) != 9){
            return false;
        } else if(Problem3.sodaAnswer(test3[0], test3[1], test3[2]) != 10){
            return false;
        } else if(Problem3.sodaAnswer(test4[0], test4[1], test4[2]) != 12){
            return false;
        } else if(Problem3.sodaAnswer(test5[0], test5[1], test5[2]) != 904){
            return false;
        } else {
            return true;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Test");       
    }
}
