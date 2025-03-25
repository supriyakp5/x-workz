class SubRegionalPoffice
{
public static void delivers(String customer,String  address)
{
	System.out.println("Regionalpoffice is running:"+customer+address );
	RegionalPoffice.deliver(customer,address);

}
}