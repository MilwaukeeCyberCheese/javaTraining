/*
 * Student Class for Problem 2
 */

public class Student {
    
    // Fill in your Class Variables here
    public String name;
    private int test1;
    private int test2;
    private int test3;

    // Write your Class Constructor Here
    public Student(String name, int test1, int test2, int test3) {
        this.name = name;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }

    // Write your Methods here
    public char average() {
        char letterGrade = 'E';
        int average = Math.round((this.test1 + this.test2 + this.test3) / 3);

        if ((90 <= average) && (average <= 100)) {
            letterGrade = 'A';
        } else if ((80 <= average) && (average < 90)) {
            letterGrade = 'B';
        } else if ((70 <= average) && (average < 80)) {
            letterGrade = 'C';
        } else if ((60 <= average) && (average < 70)) {
            letterGrade = 'D';
        } else { // Average < 60
            letterGrade = 'F';
        }

        return letterGrade;
    }

}
