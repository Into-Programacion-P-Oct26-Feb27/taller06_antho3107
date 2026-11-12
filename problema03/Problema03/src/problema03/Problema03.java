/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        double sueldo;
        int anio;
        int opcion;
        double porcentaje;
        String incremento;
        double bonificacion;
        double sueldoNuevo;
       
        System.out.println("Ingrese su nombre completo:");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese su sueldo actual:");
        sueldo = entrada.nextDouble();
        
        System.out.println("Ingrese cuantos años de servicio tiene:");
        anio = entrada.nextInt();
        
        System.out.println("Ingrese el tipo de empleado que es.\n"
                + "Empleado 1\n"
                + "Empleado 2\n"
                + "Empleado 3\n"
                + "Empleado 4");
        opcion = entrada.nextInt();
        
        switch (opcion) {
            case 1:
                porcentaje = sueldo *0.05;
                incremento = "5%";
                break;
             
            case 2:
                porcentaje = sueldo * 0.07;
                incremento = "7%";
                break;
                
            case 3:
                porcentaje = sueldo * 0.09;
                incremento = "9%";
                break;
           
            case 4:
                porcentaje = sueldo * 0.12;
                incremento = "12%";
                break;
                
            default:
                porcentaje = sueldo * 0.15;
                incremento = "15%";
                break;
        }
        
        if (anio < 2) {
            bonificacion = 0;
        } else {
            if (anio >= 2 && anio < 5){
                bonificacion = 30.00;
            } else {
                if (anio >= 5 && anio < 10){
                    bonificacion = 60.00;
                } else {
                    bonificacion = 100.00;
                }
            }
        }
        
        sueldoNuevo = sueldo + porcentaje + bonificacion;
        
        System.out.printf("\nREPORTE DE INCREMENTO SALARIAL\n\n"
                + "Empleado: %s\n"
                + "Tipo de empleado: %d\n"
                + "Años de servicio: %d\n\n"
                + "Sueldo inicial: $%.2f\n"
                + "Porcentaje de incremento: %s\n"
                + "Incremento salarial: $%.2f\n"
                + "Bonificacion por antigüedad: $%.2f\n\n"
                + "Nuevo sueldo: $%.2f\n",
                nombre,
                opcion,
                anio,
                sueldo,
                incremento,
                porcentaje,
                bonificacion,
                sueldoNuevo);
    }
    
}
