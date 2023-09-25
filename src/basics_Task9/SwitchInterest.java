package basics_Task9;

import java.util.Scanner;

public class SwitchInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("The Values for calculating the interest is :");
		
		System.out.println("The Month Number :");
		int month = sc.nextInt();
		
		System.out.println("Room Rent Per Day :");
		double rent = sc.nextDouble();
		
		System.out.println("No of Days Stayed :");
		int days = sc.nextInt();
		
		double interest = rent *  days;
		
		String monthName="";
		
		switch(month) {
			case 1:
				monthName="Januray";
				
				break;
				
			case 2:
				monthName="Feburay";
				
				
				
				break;
				
			
			case 3:
			monthName="March";
			
			
				break;
			
			case 4:
			
				monthName="April";
				
								
				break;
				
			case 5:
				monthName="May";
			
				
				break;
			
			case 6:
				monthName="June";
				
				
				break;
			
			case 7:
				monthName="July";
				
				
				break;
			
			case 8:
				monthName="August";
			
				
				break;
				
			case 9:
				monthName="September";
			
				
				break;
				
			case 10:
				monthName="October";
			
				break;
				
			case 11:
				monthName="November";
			
				break;
				
				
			case 12:
				monthName="December";
				
				break;
				
			default:
				System.out.println("Invalid month");
				
		}
		
		System.out.printf("The Room Interest for the Month " +monthName+" is "+"%.2f",interest);
			
	}

}
