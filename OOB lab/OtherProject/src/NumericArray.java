import java.util.Scanner;

public class NumericArray {
    public static void main(String[] args) {
        Scanner keybroad = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.print("The length of array: ");
        int n = keybroad.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = keybroad.nextInt();
            keybroad.nextLine();
        }
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}