package scannerclass;

import java.util.Scanner;

public class SeniorCitizen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);


System.out.println("The Age is : " );

int age = sc.nextInt();

if(age>30) {
	System.out.println("The Person is Senior Citizen");
	
}else
	System.out.println("Not a Senior Citizen");

	}

}
