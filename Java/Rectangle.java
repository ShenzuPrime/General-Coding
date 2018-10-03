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
 *  Problem: 9.1 (The Rectangle Class)
 *  Description:
 *
 *  Input: PUT THE INPUT HERE (user, file, etc.)
 *  Output: PUT THE OUTPUT HERE (display, file, etc.)
 *
 *  Visible data fields:
 *
 *  Visible methods:
 *
 *   Remarks
 *   -------
 *************************************************************************/
 public class Rectangle{
   //declaring width and height
   double width = 1;
   double height = 1;

   //Making the Constructor
   Rectangle(){}
   Rectangle(double width, double height){
     this.width = width;
     this.height = height;
   }
   //method that returns the area
   double getArea(){
     return (width*height);
   }
   //method to return the perimeter
   double getPerimeter(){
     return ((2*width)+(2*height));
   }
   //method to print what the program requires
   void printStats(){
     System.out.println("Width: "+width);
     System.out.println("Height: "+height);
     System.out.println("Area: "+getArea());
     System.out.println("Perimeter: "+getPerimeter());
   }

   public static void main(String[] args){
     //intializing the new objects
     Rectangle a = new Rectangle(4,40);
     Rectangle b = new Rectangle(3.5,35.9);
     //printing out the stats of the objects
     System.out.println("Rectangle A");
     a.printStats();
     System.out.println();
     System.out.println("Rectangle B");
     b.printStats();
   }
 }
