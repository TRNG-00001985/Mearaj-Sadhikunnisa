package code;
import java.util.Scanner;
public class IndexOf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Array size must be greater than zero.");
            return;
        }
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to find: ");
        int elementToFind = scanner.nextInt();
        int index = -1; 
        for (int i = 0; i < size; i++) {
            if (array[i] == elementToFind) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element " + elementToFind + " is found at index " + index + ".");
        } else {
            System.out.println("Element " + elementToFind + " is not present in the array.");
        }

      

	}

}
