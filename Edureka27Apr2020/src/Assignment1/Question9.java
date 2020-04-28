package Assignment1;
import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number to get tables");
		int num = obj.nextInt();
		for (int i=1;i<=10;i++) {
			System.out.println(i+"  * "+num+" = "+i*num);
		}
		

	}

}
