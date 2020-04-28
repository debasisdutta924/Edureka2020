package Assignment1;
import java.util.Scanner;
//Write a program to check if the number is positive or negative
//Extend the previous program to check whether the given number is positive, zero or
//negative. (Hint: use if-else conditions)
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("positive number");
		} if (num < 0){
			System.out.println("negative number");
		} 
		
		if (num > 0) {
			System.out.println("positive number");
		} else if (num < 0){
			System.out.println("negative number");
		} else {
			System.out.println("Number is Zero ");
		}
		

	}

}
