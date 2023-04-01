import javax.swing.JOptionPane;

public class CuentaCifraApp {
    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog("deme un numero");
        int convert = Integer.parseInt(texto);

        if (convert < 0) {
            System.out.println("el numero es menor 0");
            System.exit(-1);
        } else {
            System.out.println("el numero ingresado tiene " + texto.length() + " cifras");
        }
    }
}
