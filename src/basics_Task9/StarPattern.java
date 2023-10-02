package basics_Task9;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  int i, j;
	     
	      for( i=1;i<=5;i++){
	         for( j=1;j<=5;j++){
	           if((i+j==6)||(i==j)) {
	        	   System.out.print("X");
	           }
	            	               
	          else
	         System.out.print(" ");
	      }
	      System.out.println();
	      }
	}

}
