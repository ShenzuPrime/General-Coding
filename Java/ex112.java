/*************************************************************************
 *
 *  Kean University
 *  Spring 2015
 *  Computer Organization and Programming
 *
 *  Course: CPS 2231-02
 *  Author: Ian Brugal
 *  References: Liang's book
 *
 *  Problem: 11.2
 *  Description: the person, student, employee, faculty, etc. hierarchy
 *
 *  Input: PUT THE INPUT HERE (user, file, etc.)
 *  Output: PUT THE OUTPUT HERE (display, file, etc.)
 *
 *  Visible data fields:
 *  COPY DECLARATION OF VISIBLE DATA FIELDS HERE
 *
 *  Visible methods:
 *  COPY SIGNATURE OF VISIBLE METHODS HERE
 *
 *
 *   Remarks
 *   -------
 *
 *
 *************************************************************************/

public class ex112{
	public static void main(String[] args){
		Person bob = new Person("Bob", "400 Jackson Drive", "123-456-7890", "Bob@Gmail.com");
		Student jack = new Student("Jack", "401 Jackson Drive", "123-456-7809", "Jack@Gmail.com", 1);
		Employee carl = new Employee("Carl", "402 Jackson Drive", "123-456-8790", "Carl@Gmail.com", "302A", 40000);
		Faculty dan = new Faculty("Dan", "403 Jackson Drive", "123-456-8709", "Dan@Gmail.com", "302B", 50000, "Wed 4pm-7pm", "Supervisor");
		Staff john = new Staff("John", "404 Jackson Drive", "111-222-3333", "John@gmail.com", "302C", 25000, "Sales Associate");

		System.out.println(bob.toString());
		System.out.println(jack.toString());
		System.out.println(carl.toString());
		System.out.println(dan.toString());
		System.out.println(john.toString());
	}
}

class Person{
	//A person has a name, address, phone number, and email address.
	String name;
	String address;
	String phone;
	String email;
	Person(String name, String address, String phone, String email){
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	public String toString(){
		return (name+" is a Person");
	}
}

class Student extends Person{
	//A student has a class status
	//(freshman,sophomore, junior, or senior).
	//Define the status as a constant.
	final int freshman =1;
	final int sophomore =2;
	final int junior=3;
	final int senior=4;
	final int status;
	Student(String name, String address, String phone, String email, int status){
		super(name, address, phone, email);
		this.status = status;
	}
	public String toString(){
		return (name+" is a Student");
	}
}

class Employee extends Person{
	//An employee has an office, salary, and date hired.
	String office;
	double salary;
	java.util.Date dateHired;
	Employee(String name, String address, String phone, String email, String office, double salary){
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
	}
	public String toString(){
		return (name+" is an Employee");
	}
}

class Faculty extends Employee{
	//A faculty member has office hours and a rank.
	String officeHours;
	String rank;
	Faculty(String name, String address, String phone, String email, String office, double salary, String officeHours, String rank){
		super(name, address, phone, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	public String toString(){
		return (name+" is apart of the Faculty");
	}
}

class Staff extends Employee{
	//A staff member has a title
	String title;
	Staff(String name, String address, String phone, String email, String office, double salary, String title){
		super(name, address, phone, email, office, salary);
		this.title = title;
	}
	public String toString(){
		return (name+" is apart of the Staff");
	}
}
