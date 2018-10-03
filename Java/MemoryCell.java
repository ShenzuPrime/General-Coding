// Generic class
import java.util.*;
class MemoryCell<T>{
	// data fields
	private T storedValue;
	// constructors
	MemoryCell(T initialValue){
		storedValue = initialValue;
	}
	MemoryCell(){
		storedValue = null;
	}
	// other methods
	public T read(){
		return storedValue;
	}
}

public class testMemoryCell{
	public static void main(String[] args){
		int[] X1 = new int[100];
		double[] X2 = new double[20];
		MemoryCell<Integer> X = null;
		MemoryCell<Integer> Y = new MemoryCell<Integer>(37);
		MemoryCell<Double> Z = new MemoryCell<Double>();
		//X.read();
		System.out.println("The value stored in one memory cell is "+Y.read());
		System.out.println("The value stored in the other is "+Z.read());

	}
}
