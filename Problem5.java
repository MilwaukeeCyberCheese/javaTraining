import java.util.LinkedList;

/*
 * Given a base b and two non-negative base-b integers p and m, compute p mod m
 * and print the result as a base b integer.
 * p mod m is defined as the smallest non-negative integer k such that p = am + k for some integer a.
 * 
 * Input
 * Input consists of a number of cases (at most 1000). Each case is represented
 * by a line containing three non-negative integers. 
 * The first, b, is a base-10 number between 2 and 10. 
 * The second, p, contains up to 1000 digits between 0 and b-1. 
 * The third, m, contains up to 9 digits between 0 and b-1. 
 * The last case is followed by a line containing 0.
 * 
 * Output
 * Return a linked list containing p mod m
 * as a base-b integer for each test case
 */

 /*
  * HINTS:
    * 1. You can use the BigInteger class to represent arbitrarily large integers.
    * 2. You can use the Scanner class to read input from a file as in problem 4
    * 3. You can convert a BigInteger to a base-b integer using the toString(int radix) method
  */
 public class Problem5{
    public static LinkedList<Integer> bases(){

      LinkedList<Integer> answer = new LinkedList<Integer>();

      answer.add(1);
      answer.add(1234567);
      
      return answer;
    }
 }