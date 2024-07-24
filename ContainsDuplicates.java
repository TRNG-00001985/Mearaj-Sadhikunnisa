package code;

import java.util.HashSet;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2};
        boolean hasDuplicates = false;
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : array) {
            if (seen.contains(num)) {
                hasDuplicates = true;
                break;
            }
            seen.add(num);
        }
        
        System.out.println("Contains duplicates: " + hasDuplicates);
    }
}
