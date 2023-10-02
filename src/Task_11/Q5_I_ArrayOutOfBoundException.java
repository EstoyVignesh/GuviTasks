package Task_11;

public class Q5_I_ArrayOutOfBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {1,5,8,2};
		
	System.out.println("The Length of arr[] Counted Index from '0' onwards  is : "+arr.length);
	
	
	try {
	System.out.println("The value of arr[4] is "+arr[4]);
	
	}
	
	catch(ArrayIndexOutOfBoundsException ex)
	{
		System.out.println("Length of the Array Index is arr[] is 3 So arr[4] is Out od Bounds");
		
	}
	catch(Exception ex)
	{
		ex.getStackTrace();
	}
		System.out.println("Use Try Block");
	}

}
