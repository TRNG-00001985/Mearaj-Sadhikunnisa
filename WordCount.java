package code;

public class WordCount {
    public static void main(String[] args) {
        String str = "Hello world this is a test";
        if (str == null || str.isEmpty()) {
            System.out.println("Word count: 0");
            return;
        }
        String[] words = str.split("\\s+");
        System.out.println("Word count: " + words.length);
    }
}
