package code;

public class MostCommonCharacter {
    public static void main(String[] args) {
        String str = "abracadabra";
        int[] freq = new int[256];
        char mostCommon = ' ';
        int maxCount = 0;

        for (char c : str.toCharArray()) {
            freq[c]++;
            if (freq[c] > maxCount) {
                maxCount = freq[c];
                mostCommon = c;
            }
        }

        System.out.println("Most common character: " + mostCommon);
    }
}
