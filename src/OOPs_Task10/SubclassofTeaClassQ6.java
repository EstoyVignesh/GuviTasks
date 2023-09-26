package OOPs_Task10;

class NTea
{
	void prepareTea()
	{
		String ingredient = "Tea Leaves";
		
		String ingredient1 = "Hot Water";
		
		System.out.println("Normal Tea = "+ingredient +" with "+ingredient1);
    }
}
class BlackTea extends NTea
{
	void prepareTea()
	{
		String ingredient = "Tea Leaves";
		
		String ingredient1 = "Hot Water";
		
		System.out.println("Black Tea = "+ingredient +" with "+ingredient1);
	}
}
class GreenTea extends NTea
{
	
	void prepareTea()
	{
        String ingredient = "Tea Leaves";		
		String ingredient1 = "Hot Water";
		
		String ingredient2 = "Flavour Pouch";	
		System.out.println("Green Tea = "+ingredient +" with "+ingredient1+","+ingredient2);
}
}
class HerbalTea extends NTea
{
	void prepareTea()
	{
        String ingredient = "Tea Leaves";		
		String ingredient1 = "Hot Water";
		
		String ingredient2 = "Flavour Pouch";	
		String ingredient3 = "Herbs";
		System.out.println("Herbal Tea = "+ingredient +" with "+ingredient1+","+ingredient2+" and "+ingredient3);
}
	

}
public class SubclassofTeaClassQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlackTea ob = new BlackTea();
		ob.prepareTea();
		
		GreenTea ob1 = new GreenTea();
		ob1.prepareTea();
		
		HerbalTea ob2 = new HerbalTea();
		ob2.prepareTea();

	}

}

