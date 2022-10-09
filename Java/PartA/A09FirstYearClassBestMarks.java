/*
Program-9: Define a class called first year with above attributes and define a suitable
constructor.
Also write a method called best Student () which process a
first-year object and return the student with the highest total mark. In the
main method define a first-year object and find the best student of this class
 */

import java.util.Scanner;
public class A09FirstYearClassBestMarks {

	String className;
	String  classTeacherName;
	int studentCount;
	String studentName[] = new String[50];  // Student Name Array
	int studentMarks[ ] = new int[50];     // Student Marks Array
	Scanner sc  = new Scanner(System.in);

	// Below is constructor function that is called when you create object of this class
	public A09FirstYearClassBestMarks(){
		getInfo();
	}
	
	private void getInfo(){

		System.out.print("Enter the class name: ");
		className = sc.nextLine();

		System.out.print("Enter class teacher name: ");
		classTeacherName = sc.nextLine();

		System.out.print("Enter number of students: ");
		studentCount = Integer.parseInt(sc.nextLine());

		System.out.println("Please enter names " + studentCount + " students: ");
		for(int i = 0; i < studentCount; i++)
				studentName[i] = sc.nextLine();

		System.out.println("Enter marks for students ");
		for(int i = 0; i < studentCount; i++){
			System.out.print("Enter marks for " + studentName[i] + ": ");
			studentMarks[i] =sc.nextInt();
			System.out.println();  // go to next line
		}
	}

	public void display(){
		System.out.println("\n\nClass and Student Info");
		System.out.println("Class Name: " + className);
		System.out.println("Class Teacher Name: " + classTeacherName);
		System.out.println("Student Names\t\tMarks");
		System.out.println("-------------\t\t------");
		for(int i = 0; i < studentCount; i++)
			System.out.println(studentName[i] + "\t\t\t" + studentMarks[i]);
	}

	public void bestStudent(){
			int best = 0;  // variable to keep track of best marks till now when looping
			int k = -1 ;   // variable to keep track of best student-index. Note that since index start from 0, initialize this to -1.

			// loop through all student marks and pick best marks.
			for(int i= 0; i <= studentCount; i++){
					if(studentMarks[i] > best){
							best = studentMarks[i];
							k = i;  // keep track of index. As student at this index is best marks.
					}
			}	

				// once out of loop you will have student who got best marks. student index is k.
			System.out.println("The best student is " + studentName[k]);
			System.out.println("They scored marks which was highest - " + studentMarks[k]);
		}

	public static void main (String args[]){
		A09FirstYearClassBestMarks fy = new A09FirstYearClassBestMarks();  // this will trigger getinfo function
		fy.display();
		fy.bestStudent();
	}
}

/*
Output -
Enter the class name: BCA
Enter class teacher name: Teacher1
Enter number of students: 3
Please enter names 3 students: 
student1
student2
student3
Enter marks for students 
Enter marks for student1: 99

Enter marks for student2: 95

Enter marks for student3: 12



Class and Student Info
Class Name: BCA
Class Teacher Name: Teacher1
Student Names		Marks
-------------		------
student1			99
student2			95
student3			12
The best student is student1
They scored marks which was highest - 99
*/
