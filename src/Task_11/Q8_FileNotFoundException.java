package Task_11;

import java.io.File;
import java.util.Scanner;

public class Q8_FileNotFoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try
		{
			File file = new File("C:\\Users\\arvin\\eclipse-workspace\\learn_java\\master1.txt");
			Scanner sc = new Scanner(file);
		}
		catch(Exception ex)
		{
			
			ex.printStackTrace();
		}
		
			System.out.println("Empty block");
		
		
		
	}

}
