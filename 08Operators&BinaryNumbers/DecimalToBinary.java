
public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 11; // Example number
        // expected: 1011 (8 + 0 + 2 + 1)

        System.out.println("Decimal: " + n);

        int binaryNum = 0;
        int power = 0; // Represents power of 10

        while (n > 0) {
            int rem = n % 2; // Remainder (0 or 1)
            binaryNum = binaryNum + (rem * (int) Math.pow(10, power));

            n = n / 2; // Divide by 2
            power++;
        }

        System.out.println("Binary: " + binaryNum);
    }
}
