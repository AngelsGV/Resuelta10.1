import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Integer leerEntero() {
        Integer resultado;
        while (true) {
            try {
                System.out.print("Introducir entero: ");
                resultado = new Scanner(System.in).nextInt();
                break; //Se llega aquí si la lectura ha sido entero
            }catch (InputMismatchException ex){
                System.out.println("Tipo erróneo.");
            }
        }return resultado;
    }
}