package OOPs_Task10;



class TeaObjects
{
	void prepareTea(String ingredient,String ingredient1)
	{
		
		String str = ingredient.concat(ingredient1);
		System.out.println("The Ingredients needed for Normal Tea : "+str);
	}
	
	void prepareTea(String ingredient, String ingredient1, String ingredient2)
	{
		String str1 = ingredient.concat(ingredient1).concat(ingredient2);
		System.out.println("The Ingredients needed for Milk Tea : "+str1);
	}
}

class TeaPreparation extends TeaObjects
{
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
		obj.prepareTea("HotWater ", "TeaLeaves");
		
		obj.prepareTea("HotWater ", "TeaLeaves ", "Milk");
		
		
		TeaPreparation tea = new TeaPreparation();
		tea.prepareTea("HotWater", " TeaLeaves ", "Herbs");
	}

}
