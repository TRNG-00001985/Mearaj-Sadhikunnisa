package code;
import java.util.Scanner;
public class Octatohexa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter octal number:");
		String octal=scanner.next();
		int decimal=Integer.parseInt(octal,8);
		String hex=Integer.toHexString(decimal);
		System.out.println("Hexadecimal:" +hex);

	}

}
