package code;
import java.util.Scanner;
public class Contains {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the size of array: ");
		        int size = scanner.nextInt();

		        int[] array = new int[size];
		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < size; i++) {
		            array[i] = scanner.nextInt();
		        }
		        System.out.print("Enter the element to search for: ");
		        int elementToFind = scanner.nextInt();
		        boolean found = false;
		        for (int num : array) {
		            if (num == elementToFind) {
		                found = true;
		                break;
		            }
		        }
		        if (found) {
		            System.out.println("Element " + elementToFind + " is present in the array.");
		        } else {
		            System.out.println("Element " + elementToFind + " is not present in the array.");
		        }
		        scanner.close();
		    }
		}


	
