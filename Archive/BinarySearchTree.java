import java.util.*;
/*************************************************************************

   Kean University
   Fall 2015
   Data Structures and Algorithms

   Course: CPS 2232
   Author: Ian Brugal
   Collaborators: Prof M (Provided BST code) Mark Allen Weiss wrote the code
   References: Java API, Algorithms, 4th edition

   Homework: 04
   Problem:
   Description:

   Input: PUT THE INPUT HERE (user, file, etc.)
   Output: PUT THE OUTPUT HERE (display, file, etc.)

   Visible data fields:


   Visible methods:
   void insert(  )       --> Insert x
   void remove(  )       --> Remove x
   boolean contains()  )  --> Return true if x is present
   Comparable findMin( )  --> Return smallest item
   Comparable findMax( )  --> Return largest item
   boolean isEmpty( )     --> Return true if empty; else false
   void makeEmpty( )      --> Remove all items
   void printTree( )      --> Print tree in sorted order

    Remarks
    ------
    1. I estimate the running time of searchin in a skewed BST to be (O)N^2
    or approximately (O)N^2. The running time of the balanced search tree is expected
    to be (O)Nlog(N) or approximately (O)Nlog(N). Basically the worst case for a skewed
    tree would be (O)N^2 or approximately that if a majority of the numbers are on one side.
    The balanced tree would obtain (O)Nlog(N) because if it is evenly split the contains(),
    method which is basically a binary search method will operate effciently at (O)NlogN
    because it gets rid of half the other options each itteration until does its return.
    On the other hand if one were to use the FindMin or FindMax methods those have a running time of
    (O)N because it will go through every point until it reaches the end of one side of the tree.
                | x = 1000 | x = 5000   | x = 100000
    Skeweed BST | 235183   | 542358     | 779526
    Balanced    | 1532     | 1435       | 1571


  *************************************************************************/
/// BinarySearchTree class
//
// CONSTRUCTION: with no initializer
//
// ******************PUBLIC OPERATIONS*********************
// void insert( x )       --> Insert x
// void remove( x )       --> Remove x
// boolean contains( x )  --> Return true if x is present
// Comparable findMin( )  --> Return smallest item
// Comparable findMax( )  --> Return largest item
// boolean isEmpty( )     --> Return true if empty; else false
// void makeEmpty( )      --> Remove all items
// void printTree( )      --> Print tree in sorted order
// ******************ERRORS********************************
// Throws UnderflowException as appropriate

/**
 * Implements an unbalanced binary search tree.
 * Note that all "matching" is based on the compareTo method.
 * @author Mark Allen Weiss
 */
public class BinarySearchTree<AnyType extends Comparable<? super AnyType>>
{
    //Construct the tree.
    public BinarySearchTree( )
    {
        root = null;
    }

    //Insert into the tree; duplicates are ignored.
    public void insert( AnyType x )
    {
        root = insert( x, root );
    }

    //Remove from the tree. Nothing is done if x is not found.
    public void remove( AnyType x )
    {
        root = remove( x, root );
    }


    //Find the smallest item in the tree.
    public AnyType findMin( )
    {
        if( isEmpty( ) )
            throw new UnderflowException( );
        return findMin( root ).element;
    }

    //Find the largest item in the tree.
    public AnyType findMax( )
    {
        if( isEmpty( ) )
            throw new UnderflowException( );
        return findMax( root ).element;
    }


    //Find an item in the tree.
    public boolean contains( AnyType x )
    {
        return contains( x, root );
    }

    //Make the tree logically empty.
    public void makeEmpty( )
    {
        root = null;
    }

    //Test if the tree is logically empty.
    public boolean isEmpty( )
    {
        return root == null;
    }

    //Print the tree contents in sorted order.
    public void printTree( )
    {
        if( isEmpty( ) )
            System.out.println( "Empty tree" );
        else
            printTree( root );
    }

    /**
     * Internal method to insert into a subtree.
     * @param x the item to insert.
     * @param t the node that roots the subtree.
     * @return the new root of the subtree.
     */
    private BinaryNode<AnyType> insert( AnyType x, BinaryNode<AnyType> t )
    {
        if( t == null )
            return new BinaryNode<AnyType>( x, null, null );

        int compareResult = x.compareTo( t.element );

        if( compareResult < 0 )
            t.left = insert( x, t.left );
        else if( compareResult > 0 )
            t.right = insert( x, t.right );
        else
            ;  // Duplicate; do nothing
        return t;
    }

    /**
     * Internal method to remove from a subtree.
     * @param x the item to remove.
     * @param t the node that roots the subtree.
     * @return the new root of the subtree.
     */
    private BinaryNode<AnyType> remove( AnyType x, BinaryNode<AnyType> t )
    {
        if( t == null )
            return t;   // Item not found; do nothing

        int compareResult = x.compareTo( t.element );

        if( compareResult < 0 )
            t.left = remove( x, t.left );
        else if( compareResult > 0 )
            t.right = remove( x, t.right );
        else if( t.left != null && t.right != null ) // Two children
        {
            t.element = findMin( t.right ).element;
            t.right = remove( t.element, t.right );
        }
        else
            t = ( t.left != null ) ? t.left : t.right;
        return t;
    }

    /**
     * Internal method to find the smallest item in a subtree.
     * @param t the node that roots the subtree.
     * @return node containing the smallest item.
     */
    private BinaryNode<AnyType> findMin( BinaryNode<AnyType> t )
    {
        if( t == null )
            return null;
        else if( t.left == null )
            return t;
        return findMin( t.left );
    }

    /**
     * Internal method to find the largest item in a subtree.
     * @param t the node that roots the subtree.
     * @return node containing the largest item.
     */
    private BinaryNode<AnyType> findMax( BinaryNode<AnyType> t )
    {
        if( t != null )
            while( t.right != null )
                t = t.right;

        return t;
    }

    /**
     * Internal method to find an item in a subtree.
     * @param x is item to search for.
     * @param t the node that roots the subtree.
     * @return node containing the matched item.
     */
    private boolean contains( AnyType x, BinaryNode<AnyType> t )
    {
        if( t == null )
            return false;

        int compareResult = x.compareTo( t.element );

        if( compareResult < 0 )
            return contains( x, t.left );
        else if( compareResult > 0 )
            return contains( x, t.right );
        else
            return true;    // Match
    }

    /**
     * Internal method to print a subtree in sorted order.
     * @param t the node that roots the subtree.
     */
    private void printTree( BinaryNode<AnyType> t )
    {
        if( t != null )
        {
            printTree( t.left );
            System.out.println( t.element );
            printTree( t.right );
        }
    }

    /**
     * Internal method to compute height of a subtree.
     * @param t the node that roots the subtree.
     */
    private int height( BinaryNode<AnyType> t )
    {
        if( t == null )
            return -1;
        else
            return 1 + Math.max( height( t.left ), height( t.right ) );
    }

    // Basic node stored in unbalanced binary search trees
    private static class BinaryNode<AnyType>
    {
            // Constructors
        BinaryNode( AnyType theElement )
        {
            this( theElement, null, null );
        }

        BinaryNode( AnyType theElement, BinaryNode<AnyType> lt, BinaryNode<AnyType> rt )
        {
            element  = theElement;
            left     = lt;
            right    = rt;
        }

        AnyType element;            // The data in the node
        BinaryNode<AnyType> left;   // Left child
        BinaryNode<AnyType> right;  // Right child
    }


      /** The tree root. */
    private BinaryNode<AnyType> root;


        // Test program
    public static void main( String [ ] args )
    {
      Scanner input = new Scanner(System.in);
      BinarySearchTree<Integer> s = new BinarySearchTree<Integer>();
      BinarySearchTree<Integer> r = new BinarySearchTree<Integer>();
      System.out.println("Input a number for the size of the Binary search trees: ");
      int x = input.nextInt();
      for (int a = 0; a < x; a++) s.insert(a);
      for (int a = 0; a < x; a++) s.insert((int)(Math.random()*999));

      long startTime = System.nanoTime();
      s.contains(x+1);
      System.out.println("The time it took to search for a number not in tree S was " + (System.nanoTime() - startTime) + " nanoseconds.");

      x = (int)(Math.random()*999);
      System.out.println("The random number to look for in the blananced tree is: "+x);
      startTime = System.nanoTime();
      r.contains(x);
      System.out.println("The time it took to search for a random number in tree R was " + (System.nanoTime() - startTime) + " nanoseconds.");

    }
}
