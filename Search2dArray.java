package code;

public class Search2dArray {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target = 5;
        boolean found = false;

        for (int[] row : array) {
            for (int num : row) {
                if (num == target) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        System.out.println("Found target: " + found);
    }
}

