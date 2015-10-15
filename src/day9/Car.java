package day9;

public class Car {
	
	int price;
	String model;
	public Car()
	{
		System.out.println("basic car");
	}
	public Car(int p)
	
	{
		price=p;
		
	}
	public Car(int p,String m)
	{
		price =p;
		model =m;
		
	}
	public static void main(String[] args) {
		Car c1= new Car();
		System.out.println(c1.price+"---"+c1.model);
		Car c2 = new Car(1111);
		System.out.println(c2.price);
		Car c3 = new Car(2222,"audi");
		System.out.println(c3.price + c3.model);
		
		
		
		
		

	}

}
