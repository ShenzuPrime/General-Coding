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
   private ArrayList<T> queue = new ArrayList<T>();

   Visible methods:
   public void enqueue(T item)
   public T dequeue()
   public boolean isEmpty()
   public boolean inQueue(T item)
   public String toString(){

    Remarks
    -------
    Big O running time of Methods:
    enqueue: Big O running time of 1-2 units. Finding postion of and then adding the varibale
    dequeue: Big O running time of 3-5 units. assigning the temp running the if and then the return
    isEmpty: Big O running time of 1-2 units. Looking at the array position 0 and then going from there
    inQueue: Big O running time (O)N. will have to go through all the spaces until variable is found
    toString: Big running time of (O)N. 2 units for the builder and Iterator and N units for the loop until finished



  *************************************************************************/
  import java.util.*;
   class Queue<T>{
    //Fields of the datas which are universal
    private ArrayList<T> queue = new ArrayList<T>();

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
    public String toString(){
      StringBuilder a = new StringBuilder();
      Iterator<T> iter = queue.iterator();
      while(iter.hasNext()){
			a.append(iter.next()+",");
      }
		  return a.toString();
    }
    /* I FEEL LIKE SINCE WE DID IT IN CLASS THIS LOOKS TO SIMILAR TO THE STACK
    ESPCIALLY SINCE IT'S AN ARRAYLIST. I FELT LIKE DOING THINGS DIFFERENTLY
    BUT THIS IS LIKE THE MOST EFFCIENT WAY (LESS WORDS TO TYPE) */
  }
  public class testQueue{

    public static void main(String[] args){
      Queue<Integer> q1 = new Queue<Integer>();
      System.out.println("Is the queue empty? "+q1.isEmpty());
      System.out.println(q1.toString());
      for (int x = 10; x > 0; x--) q1.enqueue(x);
      System.out.println(q1.toString());
      q1.dequeue();
      System.out.println(q1.toString());
      System.out.println("The number 4 is in the queue? "+q1.inQueue(4));
      q1.dequeue();
      System.out.println(q1.toString());
      }
    }
