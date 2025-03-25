class Hospital
{
public static void checkup(String pname,int  age, String pno,String email,String sicknes)
{
	System.out.println("hospital is running:"+pname+age+pno+email+sicknes);
	Doctor.treatment(pname,age);

}
}