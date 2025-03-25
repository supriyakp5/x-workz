class Persontry{

public static String man(int age)
{
System.out.println("person running:"+age);

if(age==30)
{
String name="nayana";
return name;
}
return ("person not visibale");
}

public static void main(String[] values)
{
   int age=50;
   String name=Persontry.man(age);
   System.out.println("run:"+name);
   
}
}


