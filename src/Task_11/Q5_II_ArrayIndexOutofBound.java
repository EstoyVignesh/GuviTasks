package Task_11;

public class Q5_II_ArrayIndexOutofBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "Java is a Programming ";    //Variable declaration
		String str1 = str.concat("Language");
		
		
		
		System.out.println("The Value of str1 is : "+ str1);
		System.out.println("The Length of String str1 is : " +str1.length());
		
		System.out.println("======================");
		
		
		//String str2 = str1.substring(30, 45);
		
		try {             // Used try block whether the output throws Exception or not
		
			String str2 = str1.substring(30, 45);
		System.out.println("The value of String str2 is : " +str2);
		
		
		}
		
		catch(StringIndexOutOfBoundsException ex)       // Used  catch Block to print the Exception raised  Reason
		{
			System.out.println("String Index is Out of Bounds Because in line 19 End Index is mentiond 45 but the  actual Index Range is 30");
			
		}
		catch(Exception ex)
		{
			ex.getStackTrace();         //Print the Exception thrown
		}
			System.out.println("Use Try Block");
	}

}
