package code;

public class IsSorted {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 5};
        boolean sorted = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                sorted = false;
                break;
            }
        }

        System.out.println("Is sorted: " + sorted);
    }
}
