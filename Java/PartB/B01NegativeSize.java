class B01NegativeSize{
		public static void main(String args[]){
				try{
						int[] a = new int[-5];
				}
				catch(NegativeArraySizeException e){
						System.out.println("Negative Array Size!!");
				}
				System.out.println("Continuing execution... ");
		}
}

/*
Output - 
Negative Array Size!!
Continuing execution... 
*/
