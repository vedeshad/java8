package Java8;

import java.util.Scanner;

public class MainClass6 
{
	public static void main(String[] args) 
	{
		//try with Resource block
		//implements AutoCloseable interface
		try(Scanner sc1 = new Scanner(System.in))
		{
			System.out.println("Enter Data");
			
			while(sc1.hasNext())
			{
				System.out.println(sc1.nextLine());
			}
		}
		
	}

}
