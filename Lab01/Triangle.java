import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner keybroad = new Scanner(System.in);
        System.out.println("The heigh of triangle: ");
        int iHeight = keybroad.nextInt();

        for (int i = 0; i < iHeight; i++) {
            for (int j = iHeight - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
