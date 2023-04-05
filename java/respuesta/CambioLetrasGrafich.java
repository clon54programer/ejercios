import javax.swing.JOptionPane;

public class CambioLetrasGrafich {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("escriba una oracion");

        for (int i = 0; i < texto.length(); i++) {
            // Hacemos un casting para convertir el char a int
            System.out.print((int) texto.charAt(i) + " ");
            JOptionPane.showMessageDialog(null, "Conversion de " + i + " a " + (int) texto.charAt(i));
        }
    }

}
