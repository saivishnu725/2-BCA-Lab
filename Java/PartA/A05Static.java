class Student{
		int roll;
		String name;
		static String college;
		
		Student(int r, String n, String c){
				roll = r;
				name = n;
				college = c;
		}

		void display()
		{
				System.out.println(roll + " " + name + " " + college);
		}
}

class A05Static{
		public static void main(String args[]){
				Student s1 = new Student(1, "s1", "sample1");
				s1.display();
				Student s2 = new Student(2, "s2", "sample2");
				s2.display();
				s1.display();
		}
}


/*
Output-
1 s1 sample1
2 s2 sample2
1 s1 sample2
*/
