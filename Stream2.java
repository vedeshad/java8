package Java8;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 
{
	public static void main(String[] args)
	{
		Stream<String> names = Stream.of("Nitesh","Vignesh","Sivasakthi","Vedesh","Vedesh");
		
		
		//long count = names.filter((s)->s.charAt(0)=='V').count();
		//long count =names.filter((s)->s.startsWith("V").count());
		
		//System.out.println(names.filter((s)->s.startsWith("S")).findFirst());
		//List<String> namesWithS=  names.filter((s)->s.startsWith("s")).collect(Collectors.toList());
		
		Set<String> collect = names.filter((s)->s.startsWith("S")).collect(Collectors.toSet());
		System.out.println(collect);
	}

}
