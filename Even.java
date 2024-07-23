package code;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num=scanner.nextInt();
		if (num%2==0) {
			System.out.println(num+" is even number");
			
		}
		else {
			System.out.println(num+" is odd number");
		}
	}

}
