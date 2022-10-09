public class A03Add{
		void sum(int x, int y)
		{
				int s = x + y;
				System.out.println("Sum = " + s);
		}

		void sum(float x, float y)
		{
				float s = x + y;
				System.out.println("Sum = " + s);
		}

		void sum()
		{
				int x = 5;
				int y = 10;
				int s = x + y;
				System.out.println("Sum = " + s);
		}

		public static void main(String args[])
		{
				A03Add a = new A03Add();
				a.sum(1, 2);
				a.sum(1.1f, 2.2f);
				a.sum();
		}
}


/*
Output -

Sum = 3
Sum = 3.3000002
Sum = 15

*/
