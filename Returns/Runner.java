class Runner{
public static void main(String[] args)
	{
	int No=990191541;
	String ref=Number.getName(No);
	System.out.println("Name:"+ ref);
	
	System.out.println("=====================");
	

    String foodItem = "biryani"; 
    int nn = Food.getPrice(foodItem); 
    System.out.println("Price: " + nn);
	
	System.out.println("*******************************");
	
    
	String name="ananya";
	String re=Company.getCompanyname(name);
	System.out.println("company:"+ re);
	
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
	
	int accno=876456788;
	int acc=Bank.getBalance(accno);
	System.out.println("Accontdetails:"+acc);
	
	
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	
	
	String names="Los Angeles";
	int trans=Transport.getPrice(names);
	System.out.println("source:"+trans);
	
	
	
	System.out.println("########################");
	
	String namess="Jeff Bezos";
	boolean pnames=Person.isAlive(namess);
	System.out.println(pnames);
	
	
}
}
