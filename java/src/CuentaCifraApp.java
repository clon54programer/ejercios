import java.util.Scanner;

public class CuentaCifraApp {
    public static void main(String[] args) {
        // Pide por teclado un número entero positivo (debemos controlarlo) y muestra el
        // número de cifras que tiene. Por ejemplo: si introducimos 1250, nos muestre
        // que tiene 4 cifras. Tendremos que controlar si tiene una o mas cifras, al
        // mostrar el mensaje.
        Scanner input = new Scanner(System.in);

        System.out.println("deme un numero");
        int entero = input.nextInt();

        if (entero < 0) {
            System.out.println("el numero es negativo");
            System.exit(-1);
        }

        String Cadena = Integer.toString(entero);// este convierte el int a String

        System.out.println("el numero ingresado tiene " + Cadena.length() + " cifras");

    }
}
