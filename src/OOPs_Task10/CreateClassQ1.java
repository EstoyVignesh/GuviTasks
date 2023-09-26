package OOPs_Task10;


class Person
{
	String name;  // Initializing Variable
	int age;
	public String getName() {  // Right click Variable --> go to Source --> select Getter and Setter
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
	
	
}
public class CreateClassQ1 {

	public static void main(String[] args) {
		
		
Person att = new Person();  // Creating Instance for Persion Class 
//att.getClass();

att.setName("Jacky");  // Setting Values for Variable by Calling Object
att.setAge(35);

System.out.println(att.getName());  // Getting Values by Calling Object
System.out.println(att.getAge());
	}

}


/*Person()
{
	name = "Jacky";
	age = 35;
	
System.out.println(name+" is his name"+","+age+" is his age.");
}

*/
