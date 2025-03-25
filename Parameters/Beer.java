class Beer {
public static void pour(int volume)
{
	System.out.println(volume);
}
public static void drink(int sips)
{
	System.out.println(sips);
}
public static void chill(int temp)
{
	System.out.println(temp);
}
public static void openbottele(boolean ToF)
{
	System.out.println(ToF);
}
public static void checkcontent(boolean ToF)
{
	System.out.println(ToF);
}
public static void serve(String brand, int quantity,char size)
	{
        System.out.println("brand"+quantity+size);
    }
public static void price(float amount, int botteles,double cost)
	{
        System.out.println(amount+botteles+cost);
    }
}