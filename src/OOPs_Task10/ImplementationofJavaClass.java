package OOPs_Task10;


interface employee
{
	public int id = 201;
	public String firstName = "Boa";
	public String lastName = " Hancock";
	String name = firstName.concat(lastName);
	
	
	
	public int salary = 50000;
	
	void empDetails();
	void raiseSalary();
}

public class ImplementationofJavaClass implements employee {
	
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
			// TODO Auto-generated method stub
			
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationofJavaClass obj = new ImplementationofJavaClass();
		obj.empDetails();
		

		
	}


}
