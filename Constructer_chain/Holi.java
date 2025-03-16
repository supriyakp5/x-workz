class  Holi
{
String day;
String date;
String location;
String festival;
int games;
int programes;

Holi(){
System.out.println("holiiiiii");
}

Holi(String day,String date)
{
super();
System.out.println("use superkey use" + day + "," + date);
}

Holi(String location,String festival)
{
this();
this.location=location;
this.festival=festival;
System.out.print("holi1:"+location+ "," + festival);
}


Holi(String day, String date, String location , String festival , int games , int programes)
{
	this(date , day);

	
	System.out.println(".................:"+day+ "," +date+ "," + location + "," + festival+ "," + games+ "," + programes);
	
}
}

	
