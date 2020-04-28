package Assignment1;
import java.util.Scanner;
//Write a program to reverse the digits of a number.
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i=1;num != 0;num = num/10) {
			
			rev = rev * 10+ (num % 10);
			}
		
		System.out.format("The revese number is %d", rev);
		System.out.println();

	}

}
