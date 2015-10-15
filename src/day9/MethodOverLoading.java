package day9;

public class MethodOverLoading {
	
	public static void sumALL(int a,int b)
	{
		System.out.println(a+b);
		
	}
	public static void sumALL(double a,double b)
	{
		System.out.println(a+b);
		
	}
	public static void sumALL(String a,String b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		sumALL(10,20);
		sumALL(10.45,67.89);
		sumALL("hello","friend");
		
		

	}

}
