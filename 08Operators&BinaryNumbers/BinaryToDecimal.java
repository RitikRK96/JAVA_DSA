
public class BinaryToDecimal {
    public static void main(String[] args) {
        int myBinaryNumber = 10110;
        // Expected Decimal: 0*1 + 1*2 + 1*4 + 0*8 + 1*16 = 22

        System.out.println("Binary: " + myBinaryNumber);

        int decimal = 0;
        int power = 0; // Represents power of 2 (2^0, 2^1...)

        while (myBinaryNumber > 0) {
            int lastDigit = myBinaryNumber % 10; // Get last digit
            decimal = decimal + (lastDigit * (int) Math.pow(2, power));

            myBinaryNumber = myBinaryNumber / 10; // Remove last digit
            power++; // Increase power
        }

        System.out.println("Decimal: " + decimal);
    }
}
