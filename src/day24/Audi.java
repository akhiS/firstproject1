package day24;

public class Audi extends Car{
	
	String model;
	 public void stop()
	 {
		 System.out.println("this is stop");
	 }
	 public static void main(String[] args)
	 {
		Audi a =new Audi();
		a.model ="A4";
		a.stop();
		a.price=11111;
		a.start();
		
	 }
	 
	 

}
