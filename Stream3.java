package Java8;
import java.util.*;
import java.util.stream.Collectors;

public class Stream3 
{
	public static void main(String[] args) 
	{
		List<Integer> marks = new ArrayList<>();
		marks.add(90);
		marks.add(23);
		marks.add(34);
		marks.add(95);
		marks.add(45);
		
		System.out.println(marks);
		
		
		 long count = marks.stream().filter((m)->m>=35).count();
		System.out.println(count);
		
		
		
	 List<Integer> updatedMarks = marks.stream().map((m)->m+10).collect(Collectors.toList());
		System.out.println(updatedMarks);
		
		List<Integer> updatedMarks1 = marks.stream().filter((m)->m<=50&&m%2==0).map((m)->m+10).collect(Collectors.toList());
		System.out.println(updatedMarks1);
		
		
	}

}
