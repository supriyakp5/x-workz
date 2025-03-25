class Station{

public static void send(String name)
{
System.out.println("running send");

System.out.println("In station " + name);
DelivaryGuy.accept(name);
}
}
