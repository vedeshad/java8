package Java8;


enum Days
{
	MON,TUE,WED,THURS,FRI,SAT,SUN, ;
	
}

public class Mainclass3
{
	public static void main(String[] args)
	{
		for(Days d1:Days.values())
		{
			System.out.println(d1.ordinal()+1+" -> "+d1);
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(Days.values());
		
	}

}
