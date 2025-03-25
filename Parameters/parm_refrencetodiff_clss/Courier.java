class Courier
{
public static void pickup(String pname)
{
	System.out.println("In courier " +pname);
Station.send(pname);
}
}
