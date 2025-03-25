class RegionalPoffice
{
public static void deliver(String customer,String  address)
{
	System.out.println("Regionalpoffice is running:"+customer+address );
	PostH.hmaster(customer,address);

}
}