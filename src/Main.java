import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numNoches = 0;

        while (numNoches <= 0){
            System.out.println("¿Cuántas noches estarás en la habitación?");

            try{
                numNoches = scanner.nextInt();

                if (numNoches <= 0 ){
                    System.out.println("Introduzca un valor mayor a cero.");
                }

            } catch(Exception e){
                System.out.println("Entrada inválida. Por favor, introduzca un número.");
                scanner.next();
            }
        }

        int opcion = 0;
        double cargoExtra = 0;

        do{
            System.out.println("¿Quieres salir de la habitación más tarde de las 12h del mediodia el último día de tu estada?\n[1] Sí \n[2] No");

            try{
                opcion = scanner.nextInt();

            } catch (Exception e){
                System.out.println("Entrada inválida. Por favor, introduzca un número.");
                scanner.next();
            }

            switch(opcion){
                case 1:
                    cargoExtra = 15;
                    break;
                case 2:
                    cargoExtra = 0;
                    break;
                default:
                    System.out.println("Opción incorrecta. Inténtelo de nuevo.");
            }

        } while (opcion !=1 && opcion !=2);

        double precioNoche = 20;
        double importeTotal = numNoches * precioNoche + cargoExtra;

        System.out.println("El importe total de tu estadía són " + importeTotal + " euros.");

        // modificacion 1
    }

}