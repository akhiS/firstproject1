package day9;

public class Qedge {
	
	int fee;
	String cource;
	public void courceDetails(int fee, String cource)
	{
		this.fee=fee;
		this.cource=cource;
		
	}

	public static void main(String[] args) {
		
		Qedge q= new Qedge();
		q.courceDetails(5000, "seleinum");
		System.out.println(q.fee+"..."+q.cource);
		
		
		
		

	}

}
