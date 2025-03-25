class ChargerRun
{
public static void main(String[] args)
{

Charger charger1=new Charger("u",258,'n');
Charger charger2=new Charger("ugc5",250,'c');
Charger charger3=new Charger("ugc6",150,'c');
Charger charger4=new Charger("uc",250,'c');
Charger charger5=new Charger("ug1c",250,'c');

System.out.println("charger1:"+ charger1.brand + " , " +charger1.price+ " , "+charger1.type);
System.out.println("charger2:"+ charger2.brand + " , " +charger2.price+ " , "+charger2.type);
System.out.println("charger3:"+ charger3.brand + " , " +charger3.price+ " , "+charger3.type);
System.out.println("charger4:"+ charger4.brand + " , " +charger4.price+ " , "+charger4.type);
System.out.println("charger5:"+ charger5.brand + " , " +charger5.price+ " , "+charger5.type);


}
}
