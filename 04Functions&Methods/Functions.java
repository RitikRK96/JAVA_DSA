import java.util.Scanner;
public class Functions {

    public static String getGreeting(String name) {
        return "Hello, " + name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        String message = getGreeting(name);
        System.out.println(message);

        sc.close();
    }
}
