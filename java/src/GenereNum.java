import java.util.Scanner;

public class GenereNum {
    public static void main(String[] args) {
        // 8) Pide por teclado dos número y genera 10 números aleatorios entre esos
        // números.
        // Usa el método Math.random para generar un número entero aleatorio (recuerda
        // el casting de double a int).
        Scanner INPUT = new Scanner(System.in);

        System.out.println("deme un numeros otra vez");

        double numberOne = INPUT.nextDouble();

        System.out.println("deme un numero otra vez");
        double numberTwo = INPUT.nextDouble();

        System.out.println("el valor de 1: " + numberOne + "\n el valor de 2 " + numberTwo);

        numberOne = numberOne + Math.random();
        numberTwo = numberTwo + Math.random();

        System.out.println("suma random: " + numberOne);
        System.out.println("suma random: " + numberTwo);

        int Convert = (int) numberOne;
        int conversion = (int) numberTwo;

        System.out.println(Convert);
        System.out.println(conversion);
        // int numberConvert = (int) numberOne; conversion

    }
}
