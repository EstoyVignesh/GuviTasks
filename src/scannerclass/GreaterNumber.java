package scannerclass;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Finding the greater number by adding two integers Using if statement
Scanner obj1 = new Scanner(System.in);
int a = obj1.nextInt();
int b = obj1.nextInt();
int c = obj1.nextInt();
int d = obj1.nextInt();
if(a+b> c+d) {
	System.out.println("a+b is Greater");
	
}else
	System.out.println("c+d is greater");



	}

}
