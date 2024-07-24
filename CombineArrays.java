package code;

public class CombineArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] combined = new int[arr1.length + arr2.length];
        int index = 0;

        for (int num : arr1) {
            combined[index++] = num;
        }
        for (int num : arr2) {
            combined[index++] = num;
        }

        System.out.print("Combined array: ");
        for (int num : combined) {
            System.out.print(num + " ");
        }
    }
}
