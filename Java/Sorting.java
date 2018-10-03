/*************************************************************************

   Kean University
   Fall 2015
   Data Structures and Algorithms

   Course: CPS 2232
   Author: Ian Brugal
   Collaborators:
   References: Java API, Algorithms, 4th edition

   Homework: 04
   Problem:
   Description:

   Input: PUT THE INPUT HERE (user, file, etc.)
   Output: PUT THE OUTPUT HERE (display, file, etc.)

   Visible data fields:


   Visible methods:


    Remarks
    ------
    3.
    (In NanoSeconds, Approximates for 10000 numbers)
    Version | Increasing |  Decreasing  | random
    1       | 97978297   |  93178568    | 35999013
    2a      | 32672597   |  24195378    | 19289023
    2b      | 26086681   |  20245422    | 13150571

    4. I would without a doubt say that the values are significantly different from
    the values observed. A selection sort of increasing is 97978297 Nanoseconds compared to 32672597
    Nanoseconds of quicksort A. Thats a huge difference. Most likely because since the array is already sorted
    it runs through the entire array either way for Selection sorting as compared to quick sort which breaks it in half.
    Same thing for decreasing since Selection has to go through all while quick sort works it magic. When comparing
    the two different quicksorts it gets interesting. Taking into the factor of luck, Quicksort A which takes the first
    index of the array has the chance of ending up with the first or the last digit of the final product and taking longer.
    While taking the median of 3 numbers gives you a much better chance of running much more effciently by getting rid of that variable.
    But quicksort A shouldn't be looked because if luck is on your side and it perfectly gets an integer which is directly in the middle while
    the three median does not it will run faster, theoretically.


  *************************************************************************/
  import java.util.*;

  public class Sorting{
    //Selection Sort
    public static void sSort(int[] a){
      int n = a.length;
      //Nested loop to Sort the array at (0)N^2
      for (int i = 0; i < n; i++){
        int min = i;
        for (int j = i+1; j < n; j++)
          if (less(a[j], a[min])) min = j;
        exch(a, i, min);
        }
    }
    //Method to comapre if one int is less than the other
    public static boolean less(int o, int p){
      if (o < p) return true;
      else return false;
    }
    //Method to switch values in an array using a temporary place holder
    public static void exch(int[] a, int i, int j){
      int t = a[i];
      a[i] = a[j];
      a[j] = t;
    }
    //Quicksort method where you import the array and it calls the sorting method
    public static void qSortA(int[] a){

      qSortA(a, 0, a.length - 1);
    }
    //Sorting method that answers the call of the above and sorts using recursion
    private static void qSortA(int[] a, int lo, int hi){
      if (hi <= lo) return;
      //Creates the Pivot/Partition by calling upon the partition method
      int j = partitionA(a, lo, hi);
      qSortA(a, lo, j-1);
      qSortA(a, j+1, hi);
    }
    //partition method which chooses the first index as a pivot and sorts around that
    public static int partitionA(int[] a, int lo, int hi){
      int i = lo, j = hi+1;
      int v = a[lo]; //makes pivot a[0]; the first position
      while (true){
        while (less(a[++i], v)) if (i == hi) break; //increases I until pivot is smaller
        while (less(v, a[--j])) if (j == lo) break; //reducees J until pivot is greater
        if (i >= j) break;
        exch(a, i, j); //if entry is greater or smaller exchange them into place
      }
      exch(a, lo, j); // puts the pivot into position
      return j;
    }
    //Basically like the above but chooses the median of 3 for the pivot.
    public static void qSortB(int[] a){
      int b = (int)(Math.random()*a.length);
      int c = (int)(Math.random()*a.length);
      int d = (int)(Math.random()*a.length);
      int v;
      if (a[b] >= a[c] && a[b] <= a[d] || a[b] <= a[c] && a[b] >= a[d]) v = b;
      else if (a[c] >= a[b] && a[c] <= a[d] || a[c] <= a[b] && a[c] >= a[d]) v = c;
      else v = d;
      qSortB(a, 0, a.length - 1, v);
    }
    private static void qSortB(int[] a, int lo, int hi,int v){
      if (hi <= lo) return;
      int j = partitionB(a, lo, hi, v);
      qSortB(a, lo, j-1, v);
      qSortB(a, j+1, hi, v);
    }
    //partition method called upon by the above quick sort Pivot is already given so its different from the above.
    public static int partitionB(int[] a, int lo, int hi, int v){
      int i = lo, j = hi;
      while (true){
        while (less(a[++i], v)) if (i == hi) break;
        while (less(v, a[--j])) if (j == lo) break;
        if (i >= j) break;
        exch(a, i, j);
      }
      exch(a, v, j);
      return j;
    }
    public static void main(String[] args){
      //Creating these godly arrays
      int[] array1 = new int[10000];
      int[] array2 = new int[10000];
      int[] array3 = new int[10000];
      for ( int h = 0; h < array1.length; h++) array1[h] = h;
      for ( int h = 9999; h > 0; h--) array2[h] = h;
      for ( int h = 0; h < array3.length; h++) array3[h] = (int)(Math.random()*9999);
      int[] array4 = array1;
      int[] array5 = array2;
      int[] array6 = array3;
      int[] array7 = array1;
      int[] array8 = array2;
      int[] array9 = array3;

      long startTime = System.nanoTime();
      sSort(array1);
      System.out.println("Selection sorting of array 1 took " + (System.nanoTime() - startTime) + " nanoseconds.");
      startTime = System.nanoTime();
      sSort(array2);
      System.out.println("Selection sorting of array 2 took " + (System.nanoTime() - startTime) + " nanoseconds.");
      startTime = System.nanoTime();
      sSort(array3);
      System.out.println("Selection sorting of array 3 took " + (System.nanoTime() - startTime) + " nanoseconds.");

      startTime = System.nanoTime();
      qSortA(array4);
      System.out.println("Quick sorting (A) of array 4 took " + (System.nanoTime() - startTime) + " nanoseconds.");
      startTime = System.nanoTime();
      qSortA(array5);
      System.out.println("Quick sorting (A) of array 5 took " + (System.nanoTime() - startTime) + " nanoseconds.");
      startTime = System.nanoTime();
      qSortA(array6);
      System.out.println("Quick sorting (A) of array 6 took " + (System.nanoTime() - startTime) + " nanoseconds.");

      startTime = System.nanoTime();
      qSortB(array7);
      System.out.println("Quick sorting (B) of array 7 took " + (System.nanoTime() - startTime) + " nanoseconds.");
      startTime = System.nanoTime();
      qSortB(array8);
      System.out.println("Quick sorting (B) of array 8 took " + (System.nanoTime() - startTime) + " nanoseconds.");
      startTime = System.nanoTime();
      qSortB(array9);
      System.out.println("Quick sorting (B) of array 9 took " + (System.nanoTime() - startTime) + " nanoseconds.");
    }
  }
