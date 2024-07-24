package code;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysNotEqual {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the first array: ");
        int size1 = scanner.nextInt();

        int[] array1 = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements in the second array: ");
        int size2 = scanner.nextInt();

        int[] array2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        boolean areEqual = Arrays.equals(array1, array2);

        if (areEqual) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }

        scanner.close();
    }

}
