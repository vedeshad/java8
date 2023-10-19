package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Stream4 
{
	public static void main(String[] args)
	{
		int []arr = {23,22,34,5,6,66,33};
		char [] drr= {29,3,8,6,33};
		
		

		
		//IntStream stream = Arrays.stream(arr);
		//DoubleStream stream2 = Arrays.stream(drr);
		
		List<Integer> nums = Arrays.asList(1,2,3,4,9,6);
		
		nums.forEach((e)->System.out.println(e));
		
		System.out.println("--------");
		nums.forEach((e)->System.out.println(e+1));
		
		
	}

}
