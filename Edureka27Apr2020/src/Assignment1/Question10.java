package Assignment1;
import java.util.Scanner;
// Write a program to add the digits of a number.
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rem,sum;
		
		System.out.println("Please Enter any Number: ");
		int num = sc.nextInt();
		
		for (sum = 0; num > 0; num = num/10){
			rem = num % 10;
			sum = sum+ rem;
		}
		System.out.format("Sum of the digits of Given Number = %d", sum);
		System.out.println();

	}

}
