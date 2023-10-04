package Task_11;

public class Q4Integer_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 12, b = 0;  // Variable Declaration
		
		try {    // Used try block whether the output throws Exception or not
			
			int c = a/b;
			
			System.out.println("The  Value of c is : "+c);  //Output
			
		}
		catch(ArithmeticException ex1) {  // Used  catch Block to print the Exception raised  Reason
			System.out.println("Aritmetic Values Can't be Divided by Zero - '0'");
			
		}
		catch(Exception ex1) {  //Using this to Print the reason if the Exception is Thrown
			
			ex1.getStackTrace();
						
		}
		System.out.println("Execution Jumped to Catch Block once the Exception is thrown");
		
	}

}
