package code;
import java.util.Scanner;
public class Fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number to check wether it is FizzBuzz value or not:");
		int num=scanner.nextInt();
		if (num%3==0 && num%5==0) {
			System.out.println(num+" is a FizzBuzz");
		}
		else if (num%5==0) {
			System.out.println(num+ " is a Buzz");
		}
		else if (num%3==0) {
			System.out.println(num+ " is a Fizz");
		}
		else {
			System.out.println(num+ "");
		}
				
	}

}
