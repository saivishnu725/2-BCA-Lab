import java.util.Scanner;

class A06bPrime{
		public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int i, c = 0;
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            if(n <= 1)
                System.out.println("It is not a prime number");
            else
            {
                for ( i = 2; i < n; i++) {
                    if (n % i == 0)
                        c++;
                }
            if (c == 0) {
                System.out.println("It is a prime number.");
            } else {
                System.out.println("It is not a prime number.");
            }
        }
        }
}

/*
Output - 
Enter the number: 3
It is a prime number.
 */
