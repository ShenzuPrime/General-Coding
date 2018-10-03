/*************************************************************************

   Kean University
   Fall 2015
   Data Structures and Algorithms

   Course: CPS 2232
   Author: Ian Brugal
   Collaborators: Professor M.
   References: Java API, Stack class we did in class

   Homework: 03
   Problem: 1, 2, 3, 4 (Creat an Linked list stack and provide given methods for its function)
   Description:

   Input: PUT THE INPUT HERE (user, file, etc.)
   Output: PUT THE OUTPUT HERE (display, file, etc.)

   Visible data fields:
   private LinkedList<T> stack = new LinkedList<T>();

   Visible methods:
   public void push(T item)
   public T pop()
   public boolean isEmpty()
   public boolean contains(T item)
   public String toString(){

    Remarks
    ------
    3)
    Big O running time of Methods:
    push: Big O running time of (O)N. Uses the contains method to check, then adds to the end
    pop: Big O running time of 2-3 units. Checks if the stack is bigger than 0 then pops and returns with remove last. but since void returns nothing.
    isEmpty: Big O running time of 1-2 units. Checks the size of stack to see if bigger than 0 and returning
    contains: Big O running time (O)N. Will go through each spot to see if the number is within the list
    toString: Big running time of (O)N. It will keep on going until it finishes and prints out the string
    ------------------------
    4)
    Big O if an ArrayList:
    push: would be (O)N aswell. would still use the contains method and to check and then add
    pop: Would most likely be longer. around a 3-6 units. Checking if the stack is bigger and using stack.size to get the last index of the array
    isEmpty: would be the same. its simple
    contains: would also be the same. since ArrayList also has a contains... Linked list already has a contains method... IM not changing mines, I went the extra mile and can't come to erasing what i created T.T
    toString: Again big running time of (O)N

  *************************************************************************/
  import java.util.*;
  class MoveToFront<T>{
    //Data field / Linked list made
    private LinkedList<T> stack = new LinkedList<T>();

    //methods
    //uses contains method to check and remove then adds the item
    public void push(T item){
      if (stack.contains(item) == true) stack.remove(item);
      stack.add(item);
    }
    //Checks the size, if empty return null if not remove last
    public void pop(){
      if (stack.size() > 0) stack.removeLast();
    }
    //if item is in stack returns index of item and returns true
    public boolean contains(T item){
      if (stack.indexOf(item) != -1) return true;
      return false;
    }
    //no explanation required
    public boolean isEmpty(){
      if (stack.size() > 0) return true;
      return false;
    }
    //Using the same to string because it's so good ;-;
    public String toString(){
      StringBuilder a = new StringBuilder();
      Iterator<T> iter = stack.listIterator();
      while(iter.hasNext()){
			a.append(iter.next()+",");
      }
		  return a.toString();
    }
  }
  public class testMTF{
    public static void main(String[] args){
      Stack<Integer> s1 = new Stack<Integer>();
      System.out.println("Is the queue empty? "+s1.isEmpty());
      System.out.println(s1.toString());
      for (int i = 10; i > 0; i--) s1.push(i);
      System.out.println(s1.toString());
      s1.pop();
      System.out.println(s1.toString());
      System.out.println("Is the number 3 in the list? "+s1.contains(3));
    }
  }
