package code;

import java.util.Scanner;

public class Primeorcomp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scanner.nextInt();
		if (num<=1) {
			System.out.println(num+" is neither prime nor composite");
		}
		else
		{
			
			int c=0;
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					c++;
				}
			}
		if(c==2)
		{
			System.out.println(num+ " this is a prime number");
		}
		else {
			System.out.println(num+ " is a Composite number");
		}

	}

	}
}
