import java.util.*;

public class testInheritance{
	public static void main(String[] args){
		// create a circle of radius 34 colored green, and filled
		Circle A = new Circle(34,"green",true);
		System.out.println(A.toString());
	}
}

class GO{
	// data fields
	private String color = "black";
	private boolean filled;
	private Date dateCreated;

	// constructors
	GO(){
		dateCreated = new Date();
	}
	GO(String newColor, boolean filled){
		color = newColor;
		this.filled = filled;
		dateCreated = new Date();
	}

	// other methods
	public String getColor(){ return this.color;}
	public boolean isFilled(){ return this.filled;}
	public Date dateCreated(){ return this.dateCreated;}
	public void setColor(String color){ this.color=color;}
	public void setFilled(boolean newFilled){filled=newFilled;}

	public String toString(){
		return "created on "+dateCreated+"\ncolor: "+color+" and filled is "+filled;
	}
}

class Circle extends GO{
	// additional data fields
	private double radius;

	// constructors
	Circle(double newRadius, String newColor, boolean newFilled){
		super(newColor, newFilled);
		radius = newRadius;
		//setColor(newColor);
		//setFilled(newFilled);
	}
	Circle(double newRadius){
		radius = newRadius;
	}

	// additional other methods
	public void setRadius(double newRadius){radius=newRadius;}
	public double getRadius(){return radius;}

	// overriding the toString() method of geometric object
	public String toString(){
		return "The circle was "+super.toString()+" and the radius is "+radius;
	}
}

class Rectangle extends GO{
	//adtional data fields
	private double radius;


}
