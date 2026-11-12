/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01_2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema01_2 {

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
        
        if (num1<num2){
            System.out.println("La operacion no puede realizarse");
        } else {
            if(opcion ==1){
                resultado = num1 + num2;
            } else{
                if (opcion==2){
                    resultado = num1 - num2;
                } else {
                    if (opcion==3){
                        resultado = num1 * num2;
                    } else {
                        if (opcion==4){
                            resultado = num1 / num2;
                        } else {
                            if (opcion==5){
                                resultado = num1 % num2;
                            } else {
                                if (opcion==6){
                                    resultado = Math.pow(num1, num2);
                                }
                            }
                        }
                    }
                }
            }
            System.out.printf("OPERACIONES ARITMÉTICAS\n\n"
                + "Primer numero: %.2f\n"
                + "Segundo numero: %.2f\n\n"
                + "Resultado: %.2f\n", 
                num1,
                num2,
                resultado);
        }
        
    }
    
}
