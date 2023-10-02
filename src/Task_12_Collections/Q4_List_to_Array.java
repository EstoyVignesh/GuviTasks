package Task_12_Collections;

import java.util.ArrayList;
import java.util.List;

public class Q4_List_to_Array {

	public static void main(String[] args) {

	List<String> la = new ArrayList<>();
	
	la.add("Welcome");
	la.add("java");
	la.add("is a");
	la.add("Object");
	la.add("Oriented");
	la.add("Program");
	
	System.out.println(la);
	
	String[] arr =  new String[la.size()];
	
	arr =la.toArray(arr);
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	
	
		
		
		
		
	/*
		int arr[] = {15,40,25,88,76};
		
		ArrayList al = new ArrayList();
		
		for(int a :arr)
		{
			al.add(a);
			
		}
		System.out.println("The Value of al is : "+al);                */
	}

}
