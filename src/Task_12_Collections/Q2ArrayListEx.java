package Task_12_Collections;

import java.util.ArrayList;

public class Q2ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ArrayList ar = new ArrayList();     //Creating a ArrayList Class from utilities package
		
	//Variable Declaration
		ar.add("java");   
		ar.add("is a ");
		ar.add("Programming");
		ar.add("Language");
		
		System.out.println("The Value of ar is : "+ar);  //Variable Printing
		
		System.out.println("====================");
		
		ar.removeAll(ar);   //Remove the all elements within the Array by using Removeall Method
		System.out.println("The Value of ar after removing elements is : "+ar);
		

	}

}
