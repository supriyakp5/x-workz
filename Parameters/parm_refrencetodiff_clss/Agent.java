class Agent
{
public static void purchase(String vegetable,int quantity)
{
	System.out.println("Agent is running:"+vegetable+quantity );

Broker.brokerage(vegetable,quantity);

}
}