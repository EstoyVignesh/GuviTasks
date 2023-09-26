package OOPs_Task10;



class Tea
{
	String tea = "Hot Water";
	String tea1 = "Tea Leaves";
	
	void prepareTea()
	{
		
		
		System.out.println("Normal Tea = "+tea +" with "+tea1);
	}
	
	void addMilk()
	{
		String tea2 = "Milk";
		
		System.out.println("Milk Tea = "+tea +" with "+tea1+" , "+tea2);
	}
	
	void addSugar()
	{
		String tea2 = "Milk";
		String tea3 = "Sugar";
		
		System.out.println("Sweet Tea = "+tea +" with "+tea1+" , "+tea2+" and "+tea3);
	}
}

public class TeaClassQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tea t = new Tea();
t.prepareTea();
t.addMilk();
t.addSugar();
	}

}
