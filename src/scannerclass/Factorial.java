package scannerclass;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		 
		  int n = sc.nextInt();
		  System.out.println("The value of n is  : "+ n);
		  
		 // int n1 = sc.nextInt();
		  
			long fact = 1;
			for(int i=1;i<=n;i++) {
			fact = fact * i;
				
					
			}
			
			System.out.println(fact);	  
	}

}
