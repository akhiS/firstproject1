package day9;

public class Exceptionhandling {

	public static void main(String[] args) {
		
		System.out.println("selenium");
		try
		{
			System.out.println("100/0");	
		}
       catch(Exception e)
{
	System.out.println(e.getMessage());
	
}
		System.out.println("QTP");
	}

}
