import java.util.Scanner;
class Average
{
	public static void main(String args [])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1:");
		float n1 = sc.nextFloat();
		
		System.out.println("Enter number2:");
		float n2 = sc.nextFloat();
		
		System.out.println("Enter number3:");
		float n3 = sc.nextFloat();
		
		float a = (n1+n2+n3)/3;
		System.out.println("Average= "+a);
		
	}
}