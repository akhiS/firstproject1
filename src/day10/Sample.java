package day10;

import org.testng.annotations.Test;

public class Sample {

	@Test(priority=0)
	
	public void logintest()
	{
		System.out.println("this is for login app");
		
	}
		@Test(priority=1)
	
			public void registrationtesting()
	{
		System.out.println("this is registration");
		
	}
		@Test(priority=2)
		
		public void logout()
		{
			System.out.println("this is for login app");
			
		}
}
