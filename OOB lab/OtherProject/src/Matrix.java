import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner keybroad = new Scanner(System.in);
        int[][] arr1 = new int[100][100];
        System.out.println("The size of first matrix: ");
        int r1 = keybroad.nextInt();
        int c1 = keybroad.nextInt();
        System.out.println("Enter first matrix: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = keybroad.nextInt();
                keybroad.nextLine();
            }
        }

        int[][] arr2 = new int[100][100];
        System.out.println("The size of second matrix: ");
        int r2 = keybroad.nextInt();
        int c2 = keybroad.nextInt();
        System.out.println("Enter second matrix: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr2[i][j] = keybroad.nextInt();
                keybroad.nextLine();
            }
        }

        if (r1 != r2 || c1 != c2) {
            System.out.print("Two matrix have different size.");
        } else {
            int[][] temp = new int[100][100];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    temp[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            System.out.println("The sum of matrix");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {

                    System.out.print(temp[i][j] + " ");
                    System.out.println();
                }
            }
        }

    }
}