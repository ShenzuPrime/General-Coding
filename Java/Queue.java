/*************************************************************************

   Kean University
   Fall 2015
   Data Structures and Algorithms

   Course: CPS 2232
   Author: Ian Brugal
   Collaborators: Professor M.
   References: Java API, Stack class we did in class

   Homework: 02
   Problem: 1, 2, 3 (Creat an array list Queue and provide given methods for its function)
   Description:

   Input: PUT THE INPUT HERE (user, file, etc.)
   Output: PUT THE OUTPUT HERE (display, file, etc.)

   Visible data fields:


   Visible methods:



    Remarks
    -------



  *************************************************************************/
  import java.util.*;
  public class Queue<T>{
    //Fields of the datas which are universal
    private ArrayList<T> queue = new ArrayList<t>;

    //All of the methods for them points
    public void enqueue(T item){
      queue.add(item);
    }
    public T dequeue(){
      T temp = null;
      if (queue.size() > 0) {
        temp = queue.get(0);
        queue.remove(0);
      }
      return temp;
    }
    public boolean isEmpty(){
      return queue.isEmpty();
    }
    public boolean inQueue(T item){
      return queue.contains(item);
    }
    /* I FEEL LIKE SINCE WE DID IT IN CLASS THIS LOOKS TO SIMILAR TO THE STACK
    ESPCIALLY SINCE IT'S AN ARRAYLIST. I FELT LIKE DOING THINGS DIFFERENTLY
    BUT THIS IS LIKE THE MOST EFFCIENT WAY (LESS WORDS TO TYPE) */
  }
  public class testQueue{

    public String toString(){

    }
    public static void main(Strings.args)
  }
