package code;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1=scanner.nextInt();
		System.out.println("Enter second number:");
		int num2=scanner.nextInt();
		System.out.println("Before swapping num1="+num1+ ",num2="+num2);
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Before swapping num1="+num1+ ",num2="+num2);
		

	}

}
