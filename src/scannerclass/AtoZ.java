package scannerclass;

import java.util.Scanner;

public class AtoZ {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
//Scanner ch = new Scanner(System.in);
char ch, strChar;
Scanner sc = new Scanner(System.in);

System.out.print("Please Enter any Character =  ");
strChar = sc.next().charAt(0);

for(ch = strChar; ch <= 'Z'; ch++) {
	System.out.print(ch + " ");
}





	}

}
