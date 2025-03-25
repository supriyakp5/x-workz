class Doctor
{
public static void treatment(String pname,int age)
{
	System.out.println("Doctor is running:"+pname+age);
	Nurse.assist(pname);

}
}