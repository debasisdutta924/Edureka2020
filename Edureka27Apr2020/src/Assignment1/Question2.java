
package Assignment1;
import java.util.Scanner;

// Write program to perform all the arithmetic operations given in the table.

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two double values");
		Scanner obj = new Scanner(System.in);
		double A = obj.nextDouble();
		double B = obj.nextDouble();
		double C;
		C = A;
		
		System.out.println("opertor check functionality");
		System.out.println("Pre-Incremental function for first number "+ ++C);
		System.out.println("Post-Incremental function for first number  "+ C++);
		System.out.println("Post-Increment value after increment "+ C);
		System.out.println("Pre-Decremental function for first number "+ --C);
		System.out.println("Post-Decremental function for first number "+ C--);
		System.out.println("Post-Decrementalvalue after increment "+ C);
		
		System.out.println("Addition value for givne numbers "+add(A,B));
		System.out.println("Subtraction value for given numbers "+sub(A,B));
		System.out.println("Division value for given numbers "+div(A,B));
		System.out.println("Multiplication value for given numbers " +multiply(A,B));

	}
	
	static double add(double A, double B) {
		return A+B;
	}
	
	static double sub(double A,double B) {
		return (A-B);
	}
	
	static double div(double A,double B) {
		return A/B;
	}
	static double multiply(double A, double B) {
		return A*B;
	}
}

