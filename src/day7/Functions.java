package day7;

public class Functions {

	public static void main(String[] args) {
		
		int a=10,b=20,c=30;
		int r= SumALL(a,b,c);
		System.out.println(r);
		r=SumALL(100,200,300);
		System.out.println(r);
		
		

	}
	public static int SumALL(int i,int j,int k)
	{
		int temp=i+j+k;
		return temp;
		
	}
}
