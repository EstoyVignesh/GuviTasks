package OOPs_Task10;



class TeaObjects
{
	
	//Overloading with change in no. of Argument (2 Arguments)
	void prepareTea(String ingredient,String ingredient1)
	{
		// Concating or Joining the Strings using Concat Method
		String str = ingredient.concat(ingredient1);
		System.out.println("The Ingredients needed for Normal Tea : "+str);
	}
	
	void prepareTea(String ingredient, String ingredient1, String ingredient2)
	{
		String str1 = ingredient.concat(ingredient1).concat(ingredient2);
		System.out.println("The Ingredients needed for Milk Tea : "+str1);//Printing the Concat Variable
	}
}

class TeaPreparation extends TeaObjects
{
	//Overloading with change in no. of Argument (3 Arguments)
	void prepareTea(String ingredient, String ingredient1, String ingredient2)
	{
		String str2 = ingredient.concat(ingredient1).concat(ingredient2);
		System.out.println("The Ingredients needed for Herbal Tea : "+str2);
	}
}
public class PolymorphTeaObjQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TeaObjects obj = new TeaObjects();
		obj.prepareTea("HotWater ", "TeaLeaves");//calling method through Object/Instance
		
		obj.prepareTea("HotWater ", "TeaLeaves ", "Milk");
		
		
		TeaPreparation tea = new TeaPreparation();
		tea.prepareTea("HotWater", " TeaLeaves ", "Herbs");//Calling Parent Class using Subclass with Inheritance using child class Instance
	}

}
