package OOPs_Task10;


interface employee  // Creating Interface to set Variables Final/Static and to implement the values throughout classes
{
	public int id = 201;
	public String firstName = "Boa";
	public String lastName = " Hancock";  // Initializing Variable
	String name = firstName.concat(lastName);
	
	
	
	public int salary = 50000;
	
	void empDetails();
	void raiseSalary();
}

public class ImplementationofJavaClassQ2 implements employee {  // Inheriting Data's From the Interface through "implements" Keyword 
	
	@Override
	public void empDetails() {
		// TODO Auto-generated method stub
		System.out.println(name);
		int raiseSalary;
		
		int annualSalary = salary*12;
		
		System.out.println("The Annual Salary is : "+ annualSalary);
		
		System.out.println("ID: Employee Name : Salary is"+ id+":"+name+":"+salary);
		
	}
		
		@Override
		public void raiseSalary() {
				
	}
	

	public static void main(String[] args) {
		
		ImplementationofJavaClassQ2 obj = new ImplementationofJavaClassQ2(); // Initializing Instance for Subclass
		
		obj.empDetails();  // Calling Method via instance
		

		
	}


}
