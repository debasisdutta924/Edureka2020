package Assignment1;
import java.util.Scanner;


public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter till where you need fibonacci series");
		int n = sc.nextInt();
		for (int i=1;i<=n;i++) {   
			System.out.print(num1+" ");
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			
		}
		System.out.println();
		

	}

}
