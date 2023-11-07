/*
 * Problem 2
 * 
 * Mr. Reed's wants an easy way to keep track of all of the students and their grades in his class, as well as a quick way to get their average grade for the year.  
 * 
 * Create the Student class so that we can have a Student object for everyone in the class, with functions that will return their name and Letter Grade
 * 
 * Grading Rubric:
 * 90 <= A <= 100
 * 80 <= B < 90
 * 70 <= C < 80
 * 60 <= D < 70
 * 0 <= F < 60
 */

public class Problem2 {

    public static char[] problem2(String[] students, int[] test1, int[] test2, int[] test3) {
    
        Student[] classroom = new Student[7];

        // Create Student objects to fill in class array
        for (int i = 0; i < classroom.length; ++i) {
            classroom[i] = new Student(students[i], test1[i], test2[i], test3[i]);
        }

        // Enter the letter grade for each student into the gpa array
        char[] gpa = new char[7];
        for (int j = 0; j < classroom.length; j++) {
            gpa[j] = classroom[j].average();
        }
        return gpa;
    }
}
