import java.util.Scanner;
public class Semana3 {
    public static void main(String[] args){
        /*comentario*/

        short numeroEntero1 = 1;
        int numeroEntero2 = 10;
        byte numeroEntero3 = 5;
        long numeroEntero4 = 100;

        float numeroDecimal1 = 3.14f;
        double numeroDecimal2 = 3.14;

        char letra = 'A';
        String texto = "Hablen, pelaos!";

        boolean esVerdadero = true;

        //Operador Matematico
        int suma = numeroEntero1 + 37;
        System.out.println("El resultado es " + suma);

        //Lectura por teclado

        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero Entero: ");
        int numeroLeido =scanner.nextInt();
        System.out.println("El numero leido es " + numeroLeido);




    }
}