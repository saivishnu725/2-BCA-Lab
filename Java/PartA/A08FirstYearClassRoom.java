import java.util.Scanner;
public class A08FirstYearClassRoom {
    String className;
    String classTeacherName;
    int studentCount;
    String studentName[] = new String[50];  // Student Name Array
    Scanner sc  = new Scanner(System.in);
   // Below is constructor function that is called when you create object of this class
    public A08FirstYearClassRoom(){
                getInfo();
    }


    private void getInfo(){
                System.out.print("Enter the class name:");
                className = sc.nextLine();


                System.out.print("Enter class teacher name: ");
            classTeacherName = sc.nextLine();

                System.out.print("Enter total number of students in the class: ");
                studentCount = Integer.parseInt(sc.nextLine());

                System.out.println("Enter names of " + studentCount + " students:");
                for(int i = 0; i < studentCount; i++)
                    studentName[i] = sc.nextLine();
    }

    public void display(){
            System.out.println("\nClass Name: " + className);
            System.out.println("Class Teacher Name: " + classTeacherName);
            System.out.println("\t\t\tStudent Names ");
            System.out.println("\t----------------------- ");
            for(int i = 0; i < studentCount; i++)
                System.out.println(studentName[i]);
    }

    public static void main (String args[]){
                A08FirstYearClassRoom  fy = new A08FirstYearClassRoom();  // this will trigger getinfo function
            fy.display();
    }
}
/*
Output -
Enter the class name:BCA
Enter class teacher name: Teacher1
Enter total number of students in the class: 3
Enter names of 3 students:
student1
student2
student3

Class Name: BCA
Class Teacher Name: Teacher1
						Student Names 
				----------------------- 
student1
student2
student3

*/
