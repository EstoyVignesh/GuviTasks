package Task_11;



public class Q7_InvalidAgeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ThrowException.throwArithmeticException(18);     //Creting Exception by using throw keyword

		}

	}

	class ThrowException
	{
		static void throwArithmeticException(int age)
		{
			if(age<=18)
			{
				throw new ArithmeticException("age must be greater than 18");
				
			}
			else
			{
				System.out.println("age is greater than 18");
			}
			
	}

}
