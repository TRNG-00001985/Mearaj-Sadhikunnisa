package code;

import java.util.Scanner;

public class Hexatoctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Hexadecimal value:");
		String hex=scanner.next();
		int decimal=Integer.parseInt(hex,16);
		String octal=Integer.toOctalString(decimal);
		System.out.println("Octal value:" +octal);

	}

}
