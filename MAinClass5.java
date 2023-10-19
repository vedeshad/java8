package Java8;

import java.util.Objects;

//record is introduced in java14 alternate for java beans
 record Employee (int id,String name, double salary) {}
 
public class MAinClass5 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee (20, "Vedesh", 20202);
		Employee e2 = new Employee (23, "Nitish", 20202);
		Employee e3 = new Employee (25, "Sivasakthi", 20202);
		Employee e4 = new Employee (20, "Vedesha", 20202);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e4.hashCode());
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e4));
		
		System.out.println(e1.id());
		System.out.println(e1.name());
		System.out.println(e1.salary());
		
		System.out.println(Objects.hash("nandeesh"));
		System.out.println(Objects.hash("nandeesh"));

		
		

	}

}
