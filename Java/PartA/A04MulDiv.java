class A04AddSub{
		void add(int x, int y){
				int s = x + y;
				System.out.println("Sum = " + s);
		}

		void sub(int x, int y){
				int s = x - y;
				System.out.println("Difference = " + s);
		}
}

class A04MulDiv extends A04AddSub{
		void mul(int x, int y){
				int m = x * y;
				System.out.println("Product = " + m);
		}

		void div( int x, int y){
				int d = x / y;
				System.out.println("Quotient = " + d);
		}

		public static void main(String args[]){
				A04MulDiv md = new A04MulDiv();
				md.add(20, 10);
				md.sub(20, 10);
				md.mul(20, 10);
				md.div(20, 10);
		}

}

/*
Output - 

Sum = 30
Difference = 10
Product = 200
Quotient = 2
*/
