
public class Operators {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Add: " + (a + b));
        System.out.println("Subtract: " + (a - b));
        System.out.println("Multiply: " + (a * b));
        System.out.println("Divide: " + (a / b));
        System.out.println("Modulo (Remainder): " + (a % b));

        // 2. Relational Operators (Returns boolean)
        System.out.println("a > b: " + (a > b)); // true
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true

        // 3. Logical Operators
        // AND (&&): Both must be true
        System.out.println((3 > 2) && (5 > 0)); // true
        // OR (||): At least one must be true
        System.out.println((3 < 2) || (5 > 0)); // true
        // NOT (!): Reverses boolean
        System.out.println(!(3 > 2)); // false

        // 4. Assignment Operators
        int c = 10;
        c += 5; // c = c + 5 => 15
        System.out.println("c += 5: " + c);
        c *= 2; // c = c * 2 => 30
        System.out.println("c *= 2: " + c);

        // 5. Unary Operators
        int d = 10;
        // Post-increment: Use value then increment
        System.out.println("d++: " + (d++)); // Prints 10, then d becomes 11
        // Pre-increment: Increment then use value
        System.out.println("++d: " + (++d)); // d becomes 12, Prints 12
    }
}
