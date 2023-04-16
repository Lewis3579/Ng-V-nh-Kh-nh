import java.util.Scanner;
import javax.swing.JOptionPane;

public class Equation {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,
                "Type:\n1 to solve linear equation (1 variable);\n2 to solve linear equation (2 variables);\n3 to solve quadratic equation (1 variable)\n0 to exit.",
                null, 3);
        String SMenu;
        int menu;

        do {
            SMenu = JOptionPane.showInputDialog(null, "Enter your choices:", "MENU", 3);
            menu = Integer.parseInt(SMenu);
            switch (menu) {
                case 1:
                    linear1();
                    break;
            }
        } while (menu != 0);
        System.exit(0);
    }

    static void linear1() {
        Scanner keybroad = new Scanner(System.in);
        String Sa = JOptionPane.showInputDialog(null, "a:", "Linear1", 3);
        double a = Double.parseDouble(Sa);
        String Sb = JOptionPane.showInputDialog(null, "b:", "Linear1", 3);
        double b = Double.parseDouble(Sb);
        double x = -(b / a);
        JOptionPane.showMessageDialog(null, String.format("The result is: %.2f", x), "The result", 1);
    }
}
