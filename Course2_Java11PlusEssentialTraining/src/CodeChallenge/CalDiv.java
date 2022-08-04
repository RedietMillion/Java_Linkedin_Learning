import java.util.Scanner;

public class CalDiv{

	public static void main(String[] args){
	
		var sc = new Scanner(System.in);		System.out.print("Enter a numric value:");
		var n1 = sc.nextDouble();
		System.out.print("Enter a numric value:");
		var n2 = sc.nextDouble();

		double result = n1 / n2;
		System.out.print("The answer is:" + result);
	
	}
}
