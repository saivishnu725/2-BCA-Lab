import java.util.Date;
public class A10Employee {
	String name;
	Date date;

	public A10Employee(String n, Date d){
		name = n;
		date = d;
	}
	
	public static void main (String args[]){
	A10Employee e[] = new A10Employee[10];
	e[0] = new A10Employee("Ritika", new Date(2000,1,25));
	e[1] = new A10Employee("Rohit", new Date(1999,1,25));
	e[2] = new A10Employee("Himesh", new Date(2010,1,25));
	e[3] = new A10Employee("Gajendra", new Date(2022,1,15));
	e[4] = new A10Employee("Shilpa", new Date(2008,1,25));
	e[5] = new A10Employee("Deepa", new Date(2001,1,25));
	e[6] = new A10Employee("Nandini", new Date(2012,1,25));
	e[7] = new A10Employee("Ramesh", new Date(2010,1,28));
	e[8] = new A10Employee("Naseer", new Date(2011,1,25));
	e[9] = new A10Employee("Swetha", new Date(1990,1,25));
	System.out.println("Display A10Employee List");
	for(int i = 0 ; i < e.length; i++)
		System.out.println("Name: " + e[i].eloyeeName + "\t\tAppointment date: " + e[i].date.getDate() + "/" + e[i].date.getMonth() + "/"  + e[i].date.getYear() );

	//sorting
	for(int i=0 ; i < e.length; i++)
	{
		for (int j = i + 1; j < e.length; j++) {
			if (e[i].date.after(e[j].date)) {
				//swap
				A10Employee te = e[i];
				e[i] = e[j];
				e[j] = te;
			}
		}
	}
	System.out.println("---------------------------------------");
	System.out.println("Display Sorted A10Employee List as per Seniority
	for(int i = 0 ; i < e.length; i++)
	System.out.println("Name: " + e[i].eloyeeName + "\t\tAppointment date: " + e[i].date.getDate() + "/" + e[i].date.getMonth() + "/"  + e[i].date.getYear());
	}
}
