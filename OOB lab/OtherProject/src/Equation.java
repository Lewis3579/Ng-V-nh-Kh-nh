import java.util.Scanner;
import java.lang.Math;

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
                case 2:
                    linear2();
                    break;
                case 3:
                    quadratic();
                    break;
            }
        } while (menu != 0);
        System.exit(0);
    }

    static void linear1() {

        String Sa = JOptionPane.showInputDialog(null, "a:", "Linear1", 3);
        double a = Double.parseDouble(Sa);
        String Sb = JOptionPane.showInputDialog(null, "b:", "Linear1", 3);
        double b = Double.parseDouble(Sb);
        double x = 0;
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "This equation have no solutions!", "The result", 1);
        } else {
            x = -(b / a);

            JOptionPane.showMessageDialog(null, String.format("The result is: %.2f", x), "The result", 1);
        }
    }

    static void linear2() {

        String Sa1 = JOptionPane.showInputDialog(null, "a1:", "Linear2", 3);
        double a1 = Double.parseDouble(Sa1);
        String Sb1 = JOptionPane.showInputDialog(null, "b1:", "Linear2", 3);
        double b1 = Double.parseDouble(Sb1);
        String Sc1 = JOptionPane.showInputDialog(null, "c1:", "Linear2", 3);
        double c1 = Double.parseDouble(Sc1);
        String Sa2 = JOptionPane.showInputDialog(null, "a2:", "Linear2", 3);
        double a2 = Double.parseDouble(Sa2);
        String Sb2 = JOptionPane.showInputDialog(null, "b2:", "Linear2", 3);
        double b2 = Double.parseDouble(Sb2);
        String Sc2 = JOptionPane.showInputDialog(null, "c1:", "Linear2", 3);
        double c2 = Double.parseDouble(Sc2);
        double D = a1 * b2 - a2 * b1;
        double Dx1 = c1 * b2 - c2 * b1;
        double Dx2 = a1 * c2 - a1 * c2;
        double x1 = 0;
        double x2 = 0;
        if (D == 0 && Dx1 == 0 && Dx2 == 0) {
            JOptionPane.showMessageDialog(null, "This equation have infinity solutions!", "The result", 1);
        } else if (D == 0 && (Dx1 != 0 || Dx2 != 0)) {
            JOptionPane.showMessageDialog(null, "This equation have no solutions!", "The result", 1);
        } else {
            x1 = Dx1 / D;
            x2 = Dx2 / D;
        }
        JOptionPane.showMessageDialog(null, String.format("The result is: %.2f %2f", x1, x2), "The result", 1);
    }

    static void quadratic() {
        String Sa = JOptionPane.showInputDialog(null, "a1:", "Linear2", 3);
        double a = Double.parseDouble(Sa);
        String Sb = JOptionPane.showInputDialog(null, "b1:", "Linear2", 3);
        double b = Double.parseDouble(Sb);
        String Sc = JOptionPane.showInputDialog(null, "c1:", "Linear2", 3);
        double c = Double.parseDouble(Sc);
        double x, x1, x2;
        double delta = b * b - 4 * c * a;
        if (delta < 0) {
            JOptionPane.showMessageDialog(null, "This equation have no solutions!", "The result", 1);
        } else if (delta == 0) {
            x = b / (2 * a);
            JOptionPane.showMessageDialog(null, String.format("The result is: %.2f", x), "The result", 1);
        } else {
            x1 = (b + delta) / (2 * a);
            x2 = (b - delta) / (2 * a);
            JOptionPane.showMessageDialog(null, String.format("The result is: %.2f %2f", x1, x2), "The result", 1);
        }
    }
}
