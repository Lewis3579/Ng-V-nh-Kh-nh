import javax.swing.JOptionPane;
import java.lang.Math;

public class Operator {
    public static void main(String[] args) {
        String string1 = JOptionPane.showInputDialog(null, "Enter the first number:", "OPERATOR",
                JOptionPane.PLAIN_MESSAGE);
        double num1 = Double.parseDouble(string1);
        String string2 = JOptionPane.showInputDialog(null, "Enter the second number:", "OPERATOR",
                JOptionPane.PLAIN_MESSAGE);
        double num2 = Double.parseDouble(string2);
        double sum = num1 + num2;
        double different = java.lang.Math.abs(num1 - num2);
        double product = num1 * num2;
        double quotient = num1 / num2;
        JOptionPane.showMessageDialog(null,
                sum + " " + different + " " + String.format("%.2f", product) + " " + String.format("%.2f", quotient)
                        + ".",
                "The value of sum, different, product, quotient:", 0);
        System.exit(0);
    }
}