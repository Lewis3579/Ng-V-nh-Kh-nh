import java.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = javax.swing.JOptionPane.showConfirmDialog(null, "Do you want to change the first class ticket?");
        javax.swing.JOptionPane.showMessageDialog(null,
                "You have chosen: " + (option == javax.swing.JOptionPane.YES_OPTION ? "Yes" : "No"));
        System.exit(0);
    }
}
