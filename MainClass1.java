package Java8;

interface A 
{
	void m1();
	
}
class Demo implements A
{

	@Override
	public void m1() 
	{
		System.out.println("Overrided Abstract Method...");
		
	}
	
}
public class MainClass1 
{
	public static void main(String[] args) 
	{
		//Regular Way Overriding 
		//and Creating Object for class and Store it in Interface Reference variable
		A a1 =new Demo();
		a1.m1();
		//a1.m2();
		//A.m3();
		
		System.out.println("----------");
		
		//Introduced After java 8
		
		//Anonymous Inner Class 
		//(We Don't know the Class name for Anonymous Class)
		A a2 = new A() 
		{

			@Override
			public void m1() 
			{
				System.out.println("im in Anonymous Inner Class");
				
			}
			
		};
		a2.m1();
		
		System.out.println("----------");

		//Lambda Expression
		//It Works Only on FunctionInterface
		//It Should have only One Abstract method
		//Then only we can use Lambda Expression
		
		A a3 = ()->System.out.println("Hii im Lambda Expression");
		a3.m1();

	}

}
