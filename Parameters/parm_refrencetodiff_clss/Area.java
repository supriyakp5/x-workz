class Area
{
public static void deliver(String customer,String  address)
{
	System.out.println("Area is running:"+customer+address );
	SubRegionalPoffice.delivers(customer,address);

}
}