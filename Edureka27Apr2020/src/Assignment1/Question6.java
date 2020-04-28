package Assignment1;
import java.util.Scanner;
// Write a program to check given number is even or odd.
//(Hint: use % operator)
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number to be checked");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Number "+num+" Even");
		}else {
			System.out.println("Number "+num+" Odd");
		}
		

	}

}
