package OOPs_Task10;



class Account
{
	Account()
	{
			
		}
	public void withdraw() {
		
		int savingsAmount = 50000;
		int withdraw = 20000;
		int totalAmount = savingsAmount- withdraw;
		
		System.out.println("The Balance is "+totalAmount);
	}

	
	Account(int savings, int withdrawn)
	{
		
	}
	public void deposit(int savings, int deposit) {
		int totalAmount1 = savings + deposit;
		System.out.println("The Balance is "+totalAmount1);
	
	
   }
	
	
} 


public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account obj = new Account();
		obj.withdraw();
		obj.deposit(65000, 2100);
	}

}
