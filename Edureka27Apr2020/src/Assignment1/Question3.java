package Assignment1;
import java.util.Scanner;
// Write a program to check if a candidate is eligible for voting or not. (Hint: Check age)
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age ");
		while (true) {
		int age = sc.nextInt();
		if (age < 0 || age > 150) {
			System.out.println("Please enter valid age");
			continue;
		} else if (age >= 18) {
			System.out.println("Your Eligible  for Vote");
			break;
		} else {
			System.out.println("Not Eligible for Vote");
			break;
		}
		}

	}

}
