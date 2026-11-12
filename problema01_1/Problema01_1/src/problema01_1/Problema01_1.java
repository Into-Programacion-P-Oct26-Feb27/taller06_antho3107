/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01_1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema01_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int opcion;
        double num1;
        double num2;
        double resultado;
        
        resultado = 0;
        System.out.println("Ingrese la operacion aritmetica.\n"
                + "1 suma\n"
                + "2 resta\n"
                + "3 multiplicacion\n"
                + "4 division\n"
                + "5 modulo\n"
                + "6 potencia");
        opcion = entrada.nextInt();
        
        System.out.println("Ingrese el primer numero:");
        num1 = entrada.nextDouble();
        
        System.out.println("Ingrese su segundo numero:");
        num2 = entrada.nextDouble();
        
        if (num1 > num2){
            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    break;

                case 2:
                    resultado = num1 - num2;
                    break;

                case 3:
                    resultado = num1 * num2;
                    break;

                case 4: 
                    resultado = num1 / num2;
                    break;

                case 5:
                    resultado = num1 % num2;
                    break;

                case 6:
                    resultado = Math.pow(num1, num2);
                    break;

                default:
                    System.out.println("ninguna de las opciones anteriores es "
                            + "correcta");
                    break;
        }

        System.out.printf("OPERACIONES ARITMÉTICAS\n\n"
                + "Primer numero: %.2f\n"
                + "Segundo numero: %.2f\n\n"
                + "Resultado: %.2f\n", 
                num1,
                num2,
                resultado);
            
        }else {
            System.out.println("No se puede realizar la operacion");
        }
        
        
    }
    
}
