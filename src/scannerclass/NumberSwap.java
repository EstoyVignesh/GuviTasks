package scannerclass;

import java.util.Scanner;

public class NumberSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a, b, c;// x and y are to swap   
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the value of a and b");  
	       a = sc.nextInt();  
	       b = sc.nextInt();  
	       System.out.println("before swapping numbers: "+a +"  "+ b);  
	       /*swapping */  
	       c = a;  
	       a = b;  
	       b = c;  
	       System.out.println("After swapping: "+a +"   " + b);  
	       System.out.println( );  
	}

}
