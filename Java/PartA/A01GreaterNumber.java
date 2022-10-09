import java.util.Scanner;

public class A01GreaterNumber{
		public static void main(String args[]){
				Scanner sc = new Scanner(System.in);
				int x, y;

				System.out.println("Enter two numbers: ");
				x = sc.nextInt();
				y = sc.nextInt();

				if(x > y)
						System.out.println(x + " is greater than " + y);
				else
						System.out.println(x + " is lesser than " + y);
		}
}


/*
 Output -
1)

Enter two numbers: 
3 2
3 is greater than 2


2)

Enter two numbers: 
2 3
2 is lesser than 3

*/
