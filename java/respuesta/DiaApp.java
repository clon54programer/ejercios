import javax.swing.JOptionPane;

public class DiaApp {
    public static void main(String[] args) {
        String dia = JOptionPane.showInputDialog("Introduce un dia de la semana");

        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Es un dia festivo");
            default:
                System.out.println("Introduce un dia de la semana");
                System.out.println("coloque todo en minusculas");
        }
    }
}