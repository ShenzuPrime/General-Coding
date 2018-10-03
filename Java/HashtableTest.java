/*************************************************************************
 *
 *  Kean University
 *  Spring 2015
 *  Data Structures and Algorithms
 *
 *  Course: CPS 2232
 *  Author: the class
 *  References: Java API
 *
 *  Problem: P12.1 (Venugopal's book)
 *  Description: Implement a separate-chaining hash table
 *  where the chains are ArrayList<K,V>
 *
 *
 *  Visible data fields:
 *  none
 *  Visible methods:
 *  constructors, contains(), put(), remove(), etc.
 *
 *   Remarks
 *   -------
 *
 *
 *************************************************************************/
import java.util.*;

 public class myHashTable<K,V>{
    // data fields
    private double increaseFactor;
    private int currentCapacity;
    private double loadFactor;
    private int size = 0;
    private Chain[] table;
    // constructors
    myHashTable(int initialC, double increaseF, double loadF){
        this.increaseFactor = increaseF;
        this.loadFactor = loadF;
        this.currentCapacity = initialC;
        this.table = new Chain[this.currentCapacity];
        for(int i=0; i<this.table.length; i++){
            this.table[i] = new Chain();
        }
    }
    myHashTable(){
        this(10,2,.75);
    }
    // methods
    public boolean put(Entry<K,V> e){
        if(this.contains(e.key) )return false;
        if(this.size+1 > this.currentCapacity*this.loadFactor) rehash();
        int index = Math.abs(e.key.hashCode()) % this.currentCapacity;
        this.table[index].list.add(e);
        this.size++;
        return true;
    }/*

    USE THE ABOVE INDEX tHING  AND USE THAT FOR THE ITERATOR TO START WITH
    */
    public boolean contains(K k){
      for (int i=0; i <this.table.length; i++){
        Iterator<Entry> iter = this.table[i].list.iterator();
        while(iter.hasNext()){
          if ( k = iter.next()) return true;
        }
      }
      return false;
    }
    public void remove(){

    }
    private void rehash(){
        myHashTable temp = new myHashTable((int)(this.currentCapacity*this.increaseFactor),this.increaseFactor,this.loadFactor);
        for(int i=0; i<this.table.length; i++){
            Iterator<Entry> iter = this.table[i].list.iterator();
            while(iter.hasNext()){
                Entry e = iter.next();
                temp.put(e);
            }
        }
        this.table = temp.table;
        this.currentCapacity = temp.currentCapacity;
    }
    public static void main(String[] args){
      myHashTable<Integer, Integer> a = new myHashTable<Integer, Integer>();
    }
}

class Chain{
    ArrayList<Entry> list = new ArrayList<Entry>();
}

class Entry<K,V>{
    K key;
    V value;
    Entry(K k, V v){
        this.key = k;
        this.value = v;
    }
}
