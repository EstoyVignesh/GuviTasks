package basics_Task9;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "anna";
		String revStr="";
		System.out.println("The Value of str is "+ str);
		for(int i = 0;i<str.length();i++) {
			
			 revStr = str.charAt(i)+ revStr ;
			 
			 
	    }
	    
	    System.out.println("Reversed string: "+ revStr);
	    if(str.equals(revStr)) {
	    	System.out.println("The Given String is a Palindrome");
	    	
	    }else
	    	System.out.println("The Given String is not Palindrome");
		
	}

}
