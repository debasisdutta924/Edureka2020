package Assignment1;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1 = sc.nextInt();
		System.out.println("Please enter second number"); 
		int num2 = sc.nextInt();
		if (num1 > num2) {
			System.out.println("First number is bigger ammong the given number " +num1);
		}else {
			System.out.println("Second number is bigger ammong the given number " +num2);
		}

	}

}
