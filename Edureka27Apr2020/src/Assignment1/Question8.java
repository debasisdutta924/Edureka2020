package Assignment1;
import java.util.Scanner;
//Write a program to find factorial of a number.
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  the number to calculate factorial");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i<=num;i++){
        	fact = fact * i;
        }
        System.out.println("The factorial of "+num+" is "+fact);
	}

}
