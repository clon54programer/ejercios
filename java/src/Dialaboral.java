import java.util.Scanner;

class Dialaboral {
    public static void main(String[] args) {
        // variables
        String day;
        Scanner input = new Scanner(System.in);

        System.out.println("coloque un dia de la semana, para ver si le toca trabajar");

        day = input.nextLine();

        GoToWork(day);

        // programa

    }

    public static void GoToWork(String x) {
        switch (x) {
            case "lunes":
                System.out.println("te toca trabajar");
                break;
            case "miercoles":
                System.out.println("te toca trabajar");
                break;
            case "martes":
                System.out.println("te toca trabajar");
                break;
            case "jueves":
                System.out.println("te toca trabajar");
                break;
            case "viernes":
                System.out.println("te toca trabajar");
                break;
            case "sabado":
                System.out.println("no te toca trabajar");
                break;
            case "domiengo":
                System.out.println("no te toca trabajar");
                break;
            default:
                System.out.println("coloque todo el texto en minusculas");
                break;

        }
    }
}