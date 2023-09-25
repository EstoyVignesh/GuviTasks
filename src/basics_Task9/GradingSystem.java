package basics_Task9;

public class GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int grade =60;
		
		if(grade>100) {
			System.out.println("The Grade of the Student : "+"Invalid Grade");
		}
		
		else if(grade==100) {
			System.out.println("The Grade of the Student is : "+"S Grade");
		}
		
		else if(grade>=90&&grade<=99) {
			System.out.println("The Grade of the Student is : "+"A Grade");
		}
		else if(grade>=80&&grade<=89) {
			System.out.println("The Grade of the Student is : "+"B Grade");
		}
		else if(grade>=70&&grade<=79) {
			System.out.println("The Grade of the Student is : "+"C Grade");
			
		}
		else if(grade>=60&&grade<=69) {
			System.out.println("The Grade of the Student is : "+"D Grade");
	}
		else if(grade>=50&&grade<=59) {
			System.out.println("The Grade of the Student is : "+"E Grade");
		}
		else
			System.out.println("The Grade of the Student is : "+ "F Grade");
		
		
		
	}
}
