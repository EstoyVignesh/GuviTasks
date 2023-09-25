package basics_Task9;

import java.util.Scanner;

public class LargestAmongThreee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int x, y, z;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the first number: ");
	        x = sc.nextInt();
	        System.out.print("Enter the second number: ");
	        y = sc.nextInt();
	        System.out.print("Enter the third number: ");
	        z = sc.nextInt();
	        if ( x > y && x > z)
	        {
	            System.out.println("Largest number: " + x);
	        }
	        else if ( y > x && y > z )
	        {
	            System.out.println("Largest number: " + y);
	        }
	        else if ( z > x && z > y ) 
	        {
	            System.out.println("Largest number: " + z);
	        }
	        else
	        {
	            System.out.println("All the numbers are not Largest.");
	}

}
}