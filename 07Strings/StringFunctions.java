
public class StringFunctions {
    public static void main(String[] args) {
        // Concatenation
        String firstName = "Ritik";
        String lastName = "Kumar";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // Length of String
        System.out.println("Length of fullName: " + fullName.length());
        // Character at index
        System.out.println(fullName.charAt(1));
        // CompareTo(): +ve if first is bigger, 0 if equal and -ve if second is bigger
        if (firstName.compareTo(lastName) == 0) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        // Substring
        String fName = fullName.substring(0, 5);
        System.out.println(fName);


        // Check if string contains a sequence
        System.out.println("Contains 'Ritik': " + fullName.contains("Ritik")); // true

        //  StartsWith & EndsWith
        System.out.println("Starts with 'R': " + fullName.startsWith("R")); // true
        System.out.println("Ends with 'Kumar': " + fullName.endsWith("Kumar")); // true

        // Replace characters or substrings
        String str = "java is fun";
        System.out.println(str.replace("fun", "powerful")); // java is powerful

        // Lowercase & Uppercase
        System.out.println(fullName.toLowerCase()); // ritik kumar
        System.out.println(fullName.toUpperCase()); // RITIK KUMAR

        // Trim (Removes leading & trailing spaces)
        String spaces = "   Hello World   ";
        System.out.println("Trimmed: '" + spaces.trim() + "'"); // 'Hello World'

        // Split (Divides string into array based on delimiter)
        String sentence = "I love programming";
        String[] words = sentence.split(" ");
        System.out.println("First word: " + words[0]); // I

        // toCharArray (Convert string to char array)
        char[] letters = firstName.toCharArray();
        System.out.println("Char at 2: " + letters[2]); // t

        // valueOf (Convert other types to String)
        int number = 100;
        String sNum = String.valueOf(number);
        System.out.println("String value: " + sNum); // "100"

        // isEmpty vs isBlank 
        String empty = "";
        String blank = "   ";
        System.out.println("Is Empty: " + empty.isEmpty()); // true (length is 0)
        System.out.println("Is Blank: " + blank.isBlank()); // true (only whitespaces)
    }
}
