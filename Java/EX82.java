/*************************************************************************
 *
 *  Kean University
 *  Spring 2015
 *  Computer Organization and Programming
 *
 *  Course: CPS 2231-02
 *  Author: Ian Brugal
 *  References: Intro To Java
 *
 *  Problem: 8.2
 *  (Sum the major diagonal in a matrix) Write a method that sums all the numbers
 *  in the major diagonal in an n * n matrix of double values using the following
 *  header:
 *  public static double sumMajorDiagonal(double[][] m)
 *  Write a test program that reads a 4-by-4 matrix and displays the sum of all its
 *  elements on the major diagonal.
 *  Input: PUT THE INPUT HERE (user, file, etc.)
 *  Output: PUT THE OUTPUT HERE (display, file, etc.)
 *
 *  Visible data fields:
 *  COPY DECLARATION OF VISIBLE DATA FIELDS HERE
 *
 *  Visible methods:
 *
 *
 *   Remarks
 *
 *************************************************************************/
import java.util.*;
public class EX82{
  //The input matrix is square
  //Method will add the elements in the Major Diagonal which starts at (0,0)
  public static double sumMajorDiagonal(double[][] m){
    double sum = 0;
    int limit;
    if (m.length < m[0].length) limit = m.length;
    else limit = m[0].length;
    for (int i = 0; i < limit; i++)
      sum+=m[i][i];
    return sum;
  }
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a 4-by-4 matrix row by row: ");
    double[][] matrix = new double[4][4];
    for (int row = 0; row < matrix.length; row++){
      for ( int column = 0; column < matrix[0].length; column++){
        matrix[row][column] = input.nextDouble();
      }
    }
    System.out.println("The major sum is: "+sumMajorDiagonal(matrix));
  }
}
