package studentFullTime.BCA;

public class Student
{
	String name;
	int age;
	String sex;
	
	public void input(){
		name = "name";
		age = 20;
		sex = "Female";
	}
	
	public void display(){
		System.out.println("Name = " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + sex);
	}	
}

//import
import studentFullTime.BCA.*;
class A11PackageTest{
	public static void main(String args[]){
		Student s = new Student();
		s.input();
		s.display();
		
	}
}
