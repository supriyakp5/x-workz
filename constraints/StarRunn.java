class StarRunn{
public static void main(String[] args){

System.out.println("star ");
Star star =new Star();

System.out.println("star name:"+star.name);
star.name="moon";
star.magnitude=55.9;
star.temperature=35;
star.distance=590000;
System.out.println("name:"+star.name);

System.out.println("star name:"+star.magnitude);
System.out.println("star name:"+star.temperature);
System.out.println("star name:"+star.distance);


}
}