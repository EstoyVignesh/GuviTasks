package Task_11;

import java.io.File;
import java.util.Scanner;

public class Q8_FileNotFoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try         // Used try block whether the output throws Exception or not
		{
			File file = new File("C:\\Users\\arvin\\eclipse-workspace\\learn_java\\master1.txt");  //method for creating new file by using class
			Scanner sc = new Scanner(file);
		}
		catch(Exception ex)       // Used  catch Block to print the Exception raised  Reason
		{
			
			ex.printStackTrace();  //Print the Exception thrown
		}
		
			System.out.println("Empty block");
		
		
		
	}

}
