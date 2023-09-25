package basics_Task9;

public class ReversedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		String str = "Java Programming";
		String revStr="";
		System.out.println("The Value of str is "+ str);
		for(int i = 0;i<str.length();i++) {
			
			 revStr = str.charAt(i)+ revStr ;
			 
			 
	    }
	    
	    System.out.println("Reversed string: "+ revStr);
	}

}
