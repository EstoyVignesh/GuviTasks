package Task_12_Collections;

import java.util.ArrayList;

public class Q2ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ArrayList ar = new ArrayList();
		
		ar.add("java");
		ar.add("is a ");
		ar.add("Programming");
		ar.add("Language");
		
		System.out.println("The Value of ar is : "+ar);
		
		System.out.println("====================");
		
		ar.removeAll(ar);
		System.out.println("The Value of ar after removing elements is : "+ar);
		

	}

}
