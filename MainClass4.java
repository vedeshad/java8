package Java8;


enum Days1
{
	MON,TUE,WED,THURS,FRI,SAT,SUN
	
}

public class MainClass4 
{
	Days1 d1;
	MainClass4 (Days1 d1)
	{
		this.d1=d1;
	}
	
	public void display()
	{
		switch (d1)
		{
		case MON:
			System.out.println(" MONDAY");
			break;
		case TUE:
			System.out.println(" TUESDAY");
			break;
		case WED:
			System.out.println(" WEDNESDAY");
			break;
		case THURS:
			System.out.println(" THURSDAY");
			break;
		case FRI:
			System.out.println(" FRIDAY");
			break;
		case SAT:
			System.out.println(" SATURDAY");
			break;
		case SUN:
			System.out.println(" SUNDAY");
			break;
		default :
			System.out.println("INVALID");
		
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		String str ="mon".toUpperCase();
		
		MainClass4 mc4 = new MainClass4(Days1.valueOf(str));
		mc4.display();
		
	}

}
