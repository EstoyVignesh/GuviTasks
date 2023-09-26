package OOPs_Task10;


class Person
{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		age = a;
	}
	
	/*Person()
	{
		name = "Jacky";
		age = 35;
		
	System.out.println(name+" is his name"+","+age+" is his age.");
	}
	
	*/
	
}
public class CreateClassQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person att = new Person();
//att.getClass();

att.setName("Jacky");
att.setAge(35);

System.out.println(att.getName());
System.out.println(att.getAge());
	}

}
