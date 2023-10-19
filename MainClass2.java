package Java8;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Calci
{
	int add(int a , int b);
}

@FunctionalInterface
interface Calci1
{
	boolean greatest(int a,int b);
}

class MyThread implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("Hi im in Run");
		
	}
}

public class MainClass2 
{
	public static void main(String[] args) 
	{
		Calci c =(a,b)->a+b;
		System.out.println(c.add(12, 40));
		
		Calci1 c1 = (a,b)->a>b;
		System.out.println(c1.greatest(12, 40));
		
		MyThread mt1 = new MyThread();
		Thread t1 = new Thread (mt1);
		t1.start();
		
		Runnable r1 = new Runnable()
		{
			public void run()
			{
				System.out.println("Hello...");
			}
			
		};
		Thread t2 = new Thread(r1);
		t2.start();
		
		Runnable r2 =()-> System.out.println("bye");
		Thread t3 = new Thread(r2);
		t3.start();
		
		
		Thread t4 =new Thread(()->System.out.println("GE"));
		t4.start();
		
		//ToDo Operation Void Return Type
		Consumer<Integer> c11 = (n)->System.out.println(n*n);
		c11.accept(30);
		
		//Boolean Return Type
		Predicate<Integer> p1=(n)->n>0;
		System.out.println(p1.test(50));
		
		
		//Object Return Type
		Function<Integer, Integer> f1=(a)->a*a;
		System.out.println(f1.apply(3));
		
		
		//Object Return Type
		BiFunction<Integer,Integer, Integer> b1 =  (a,b)->a*b*a;
		System.out.println(b1.apply(2, 7));
		
		
		Supplier<Integer> s1 = ()->10;
		System.out.println(s1.get());
		
		
		
		
		
		
	}
	

}
