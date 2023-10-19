package Java8;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream1
{
	public static void main(String[] args) 
	{
		//Stream is an Interface
		Stream<Integer> nums = Stream.of(10,11,21,20,34,21,35,24);
		
		//System.out.println(nums);
		//System.out.println(nums.count());
		//System.out.println(nums.distinct().count());
		System.out.println(nums.filter((e)->e%2==0).count());
		
	}

	
	
	

}
