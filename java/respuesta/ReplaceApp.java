import javax.swing.JOptionPane;;

public class ReplaceApp {
    public static void main(String[] args) {
        String oracion = JOptionPane.showInputDialog("escriba una oracion");

        JOptionPane.showMessageDialog(null, oracion.replace('a', 'e'));// respuestas
    }
}
