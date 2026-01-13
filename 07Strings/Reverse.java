
public class Reverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ritik");
        int n = sb.length();
        for (int i = 0; i < n / 2; i++) {
            int front = i;
            int back = n - i - 1;
            sb.setCharAt(front, sb.charAt(back));
            sb.setCharAt(back, sb.charAt(front));
        }
        System.out.println("Reversed (Two Pointer): " + sb);

        // approach 2: Using String concatenation (Less Efficient - O(n^2))
        // Because String is immutable, this creates a new string in memory every loop
        // iteration
        String str = "Hello";
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev; // Prepend char
        }
        System.out.println("Reversed (Concat): " + rev);
    }
}
