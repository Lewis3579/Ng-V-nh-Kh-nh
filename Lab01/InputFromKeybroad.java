import java.util.Scanner;

public class InputFromKeybroad {
    public static void main(String[] args) {
        Scanner keybroad = new Scanner(System.in);
        System.out.println("What your name?");
        String strName = keybroad.nextLine();
        System.out.println("How old are you?");
        int iAge = keybroad.nextInt();
        keybroad.nextLine();
        System.out.println("How tall are you?");
        double dHeight = keybroad.nextDouble();

        System.out.println("Mrs/Ms. " + strName + ", " + iAge + " years old. " + " Your height is " + dHeight + ".");
    }
}
