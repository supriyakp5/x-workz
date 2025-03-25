class Customer
{
public static void buy(String vegetable,int quantity)
{
	System.out.println("Customer is running:"+vegetable+quantity );

Shop.sell(vegetable,quantity);

}
}