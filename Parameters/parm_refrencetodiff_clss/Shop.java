class Shop
{
public static void sell(String vegetable,int quantity)
{
	System.out.println("Shop is running:"+vegetable+quantity );

Agent.purchase(vegetable,quantity);

}
}