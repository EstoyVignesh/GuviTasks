package scannerclass;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		
		// To Find Whether the variable is a Even
		
Scanner obj = new Scanner(System.in);
int a = obj.nextInt();

if (a%2==0) {
	System.out.println("The Variable is a Even Number");
	
}else
	System.out.println("The Variable is a Odd number");

	}

}
