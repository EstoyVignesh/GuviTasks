package basics_Task9;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  int i, j, k, input;
	      input = 5;
	      System.out.println("The number of rows is defined as " +input);
	      System.out.print("The X star pattern : ");
	      k=input*2-1;
	      for( i=1;i<=k;i++){
	         for( j=1;j<=k;j++){
	            if(j==i || j==k-i+1)
	               System.out.print("X");
	                System.out.print(" ");
	          }
	          System.out.println();
	      }
	}

}
