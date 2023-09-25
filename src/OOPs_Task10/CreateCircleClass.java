package OOPs_Task10;


class Circle
{
	Circle()
	{
			
		}
	public void normal() {
		int radius = 8;
		double pi = 3.14;
		double circumference = (2*pi*radius);
		System.out.println("The value of circumference is "+circumference);
	}

	
	Circle(int radius, double pi)
	{
		double circumference = (2*pi*radius);
	}
	public void normal1(int i, double d) {
		double circumference = i*d*2;
		System.out.println("The value of circumference is "+circumference);
	
	
   }
	
	
} 


public class CreateCircleClass {
	public static void main(String[] args) {
		
	Circle obj = new Circle();
	obj.normal();
	obj.normal1(7,3.14);
	}

}
