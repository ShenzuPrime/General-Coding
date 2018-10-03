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
 *  Problem: 2x2 Linear Equation
 *  Description: https://blackboard9.kean.edu/bbcswebdav/pid-283709-dt-content-rid-1014846_1/courses/15SP_CPS_2231_02/S152231_02hwk3.pdf
 *
 *  Input: PUT THE INPUT HERE (user, file, etc.)
 *  Output: PUT THE OUTPUT HERE (display, file, etc.)
 *
 *  Visible data fields:
 *  private double a;
 *  private double b;
 *  private double c;
 *  private double d;
 *  private double e;
 *  private double f;
 *
 *  Visible methods:
 *  double getA()
 *  double getB()
 *  double getC()
 *  double getD()
 *  double getE()
 *  double getF()
 *  boolean isSolvable()
 *  double getX()
 *  double getY()
 *
 *   Remarks
 *   -------
 *************************************************************************/
 import java.util.*;
 public class LinearEquation{

   //All of the Data Fields

   private double a;
   private double b;
   private double c;
   private double d;
   private double e;
   private double f;

   //Making the most beautiful constructor in the world
   LinearEquation(double a, double b, double c, double d, double e, double f){
     this.a = a;
     this.b = b;
     this.c = c;
     this.d = d;
     this.e = e;
     this.f = f;
   }
   //All of these fantastic get methods
   double getA(){
     return a;
   }
   double getB(){
     return b;
   }
   double getC(){
     return c;
   }
   double getD(){
     return d;
   }
   double getE(){
     return e;
   }
   double getF(){
     return f;
   }
   //Method to check if this whole shibang is solvable
   boolean isSolvable(){
     if ( (a*d)-(b*c) != 0) return true;
     else return false;
   }
   //Method to get me the values of these to bad boys
   double getX(){
     return ( ( (e*d)-(b*f) ) / ( (a*d)-(b*c) ) );
   }
   double getY(){
     return ( ( (a*f)-(e*c) ) / ( (a*d)-(b*c) ) );
   }
   //Main method because everyone needs them in thier life
   public static void main(String[] args){
     //intializing the coolest of things
     double[] letters = new double[6];
     char[] letter = {'a','b','c','d','e','f'};

     //Super mandatory thingy for things
     Scanner input = new Scanner(System.in);

     //Loopiest of loops
     for(int i = 0; i < letters.length; i++){
       System.out.println("Please type in a value for "+letter[i]+".");
       letters[i] = input.nextDouble();
     }
     //Making the best object in the world
     LinearEquation sample = new LinearEquation(letters[0], letters[1], letters[2], letters[3], letters[4], letters[5]);

     // Checking if the equation can be solved and returns the X and Y values
     if (sample.isSolvable() == true){
       System.out.println("The equation is solvable.");
       System.out.println("X equals "+sample.getX());
       System.out.println("Y equals "+sample.getY());
     }
     else if (sample.isSolvable() == false) System.out.println("The equation has no solution.");
   }
 }
