package code;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;   
            
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println("Fibonacci number" + n + ": " + b);
    }
}
