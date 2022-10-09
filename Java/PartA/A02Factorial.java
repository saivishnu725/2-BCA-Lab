public class A02Factorial{
		public static void main(String args[]){
				int i, n, fact;
				for(i = 1; i <=10; i++)
				{
						fact = 1;
						n = i;
						while(n > 1)
						{
								fact *= n;
								n--;
						}
						System.out.println("Factorial of " + i + " = " + fact);
						
				}
		}
}


/*
 Output -


Factorial of 1 = 1
Factorial of 2 = 2
Factorial of 3 = 6
Factorial of 4 = 24
Factorial of 5 = 120
Factorial of 6 = 720
Factorial of 7 = 5040
Factorial of 8 = 40320
Factorial of 9 = 362880
Factorial of 10 = 3628800

*/
