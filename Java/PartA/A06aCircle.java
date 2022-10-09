import java.util.Scanner;

class A06aCircle{
		public static void main(String args[]){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the radius: ");
				float r = sc.nextFloat();
				float a = 3.14f * r * r;
				float c = 2 * 3.14f * r;
				System.out.println("Area = " + a);
				System.out.println("Circumference = " + c);
		}
}


/*
Output-
Enter the radius: 3
Area = 28.26
Circumference = 18.84
*/
