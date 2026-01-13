public class Array {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(arr.length);
        int [] marks = new int[5]; // all are correct
        // int marks1[] = new int[5];
        marks[0] = 90;
        marks[1] = 80;
        marks[2] = 70;
        marks[3] = 60;
        marks[4] = 50;
        System.out.println("Marks at index 0: " + marks[0]);
        System.out.println("Marks at index 1: " + marks[1]);
        System.out.println("Marks at index 2: " + marks[2]);
        System.out.println("Marks at index 3: " + marks[3]);
        System.out.println("Marks at index 4: " + marks[4]);
        System.err.println();
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks at index " + i + ": " + marks[i]);
        }

        // input from user
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of subjects:");
        int n = sc.nextInt();
        int userMarks[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter your marks for subject " + (i + 1) + ":");
            userMarks[i] = sc.nextInt();
        }
        System.out.println("Your marks are:");
        for (int i = 0; i < n; i++) {
            System.out.println("Marks at index " + i + ": " + userMarks[i]);
        }

        // searching an element in an array: Linear Search
        int a = 6;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                System.out.println("Found at index " + i);
            }
            
        }
        sc.close();
    }
}