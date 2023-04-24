package cubo_1gti;

import java.util.Scanner;

/**
 *
 * @author patii
 */
public class Cubo_1GTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//Declaração de variáveis
        Scanner teclado = new Scanner(System.in);

        double lado;
        double perimetro;
        double area;
        double volume;

//Entrada de dados
        System.out.print("Entre com o lado de um cubo: ");
        lado = teclado.nextDouble();

//Processamento
        perimetro = (12 * lado);
        area = (6 * lado * lado);
        volume = (lado * lado * lado);
        /* Poderia usar:
    area = 6 * Math.pow (lado,2 - ao quadrado)
    volume = Math.pow (lado,3 - ao cubo)
         */

//Saíde de dados
        System.out.println("O perimetro do cubo e = " + perimetro + " metros ");
        System.out.println("A area do cubo e = " + area + " metros ");
        System.out.println("O volume do cubo e = " + volume + " metros ");

    }

}
