package Task_11;

import java.util.Scanner;


public class Q6_InvalidPasswordExceptionEx { 
	
static class InvalidLoginCredentialsException extends Exception{   // Creating a static class to manage memory because of its importance
	
	public InvalidLoginCredentialsException(String message) {
		
		super(message);  // Super is used to call the Parent class
	}
}
	
	



	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);  //To let us Type the Input

	try {      // Used try block whether the output throws Exception or not
		
		//simulate Input
		String username = sc.nextLine();
		String password = sc.nextLine();
		
		if(!username.equals("Guvigeek123")|| !password.equals("@guvilearn21")){  //Comparing the Input and saved Credentials
			
			throw new InvalidLoginCredentialsException("Invalid username or password");  //Create our own Exception
		}
		else {
	
		System.out.println("Login Successful");
		
		}
		
	}
	
	catch(InvalidLoginCredentialsException e) {          // Used  catch Block to print the Exception raised  Reason
		System.err.println("Authentication Failed : "+e.getMessage());
	}
			
			
	}

}
