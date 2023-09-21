package scannerclass;

import java.util.Scanner;

public class Countdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num, totalDigits=0;
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("Enter a Number: ");
	      num = sc.nextInt();
	      
	      while(num!=0)
	      {
	         totalDigits++;
	         num = num/10;
	      }
	      
	      System.out.println("\nThe Total Number of Digits = " +totalDigits);

}
}