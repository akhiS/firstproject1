package firstproject;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<>();
		l.add("Selenium");
		l.add("QTP");
		l.add("rc");
		
		System.out.println(l.size());
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
			
		}
			
		
		

	}

}
