package Task_12_Collections;

import java.util.TreeMap;

public class Q3TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,String> tm = new TreeMap<Integer, String>();
		
		tm.put(103, "Geek");
		tm.put(101, "Arvind");
		tm.put(102, "Boa");
		tm.put(104, "Luffy");
		tm.put(105, "Robin");
		
		System.out.println("The Value of tm is : "+tm);
	}

}
