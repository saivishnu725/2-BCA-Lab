import java.util.Scanner;


public class A07Constructor{
		public static void main(String args[]){
				StudentInfo stu[] = new StudentInfo[3];
				for(int i = 0; i < 3; i++)
						stu[i] = new StudentInfo();
				System.out.println("\t\tStudent Details");
				System.out.println("Enrollment no.\t\tName\t\tTotal");
				for(int i = 0; i < 3; i++)
						stu[i].displayInfo();
		}
}


class StudentInfo{
		Scanner sc = new Scanner(System.in);
		String eid;
		String name;
		int s1, s2, s3, total;

		StudentInfo(){
				readStudentInfo();
		}
		
		public void readStudentInfo(){
				System.out.println("Enter student details");
				System.out.println("Enrollment no: ");
				eid = sc.next();
				System.out.println("Name: ");
				name = sc.next();
				System.out.println("Enter marks of 3 subjects: ");
				s1 = sc.nextInt();
				s2 = sc.nextInt();
				s3 = sc.nextInt();

				if(s1 >= 50 && s2 >= 50 && s3 >= 50)
						total = s1 + s2 + s3;
				else
						total = 0;
		}

		public void displayInfo(){
				System.out.println(eid + "\t\t\t" + name + "\t\t\t" + total);
		}
}

/*
Output -
Enter student details
Enrollment no: 
1
Name: 
sample1
Enter marks of 3 subjects: 
99 99 99
Enter student details
Enrollment no: 
2 
Name: 
sample2
Enter marks of 3 subjects: 
1 1 1
Enter student details
Enrollment no: 
3
Name: 
sample3
Enter marks of 3 subjects: 
12
5
1
		Student Details
Enrollment no.		Name		Total
1								sample1		297
2								sample2		0
3								sample3		0

*/
