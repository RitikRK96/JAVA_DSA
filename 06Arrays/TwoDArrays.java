import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 3;
        int column = 5;
        int[][] numbers = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        // Searching
        int x = 5;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(numbers[i][j] == x){
                    System.err.println("Found at index " + i + " " + j);
                }
            }
        }


        sc.close();
    }
}
