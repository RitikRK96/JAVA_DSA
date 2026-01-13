import java.util.*;

public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Literal vs Object
        // String literal - stored in String Pool
        String str1 = "Hello";
        String str2 = "Hello";
        // String object - stored in Heap (new memory)
        String str3 = new String("Hello");

        System.out.println("str1 == str2: " + (str1 == str2)); // true (Same reference)
        System.out.println("str1 == str3: " + (str1 == str3)); // false (Different memory)

        // 2. Input
        // NOTE: Always use nextLine() first if you plan to read sentences
        System.out.print("Enter your full name (Sentence): ");
        String fullName = sc.nextLine();
        System.out.println("Full Name: " + fullName);

        System.out.print("Enter your first name (Single Word): ");
        String name = sc.next();
        System.out.println("First Name: " + name);

        sc.close();
    }
}