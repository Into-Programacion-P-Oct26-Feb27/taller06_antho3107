/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        double avaluo;
        int opcion;
        double recargo;
        double porcentaje;
        double valor;
        String tipoAuto;
        double valorTotal;
        
        System.out.println("Ingrese su nombre completo:");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el avalúo del vehiculo:");
        avaluo = entrada.nextDouble();
        
        System.out.println("Ingrese la clasificacion de su vehiculo.\n"
                + "1 Vehículo liviano particular\n"
                + "2 Vehiculo grande particular\n"
                + "3 Taxi\n"
                + "4 Bus urbano");
        opcion = entrada.nextInt();
        
        tipoAuto = "Ninguno";
        recargo = 0;
        porcentaje = 0;
        valor = 0;
        
        switch (opcion) {
            case 1:
                porcentaje = avaluo * 0.0001;
                valor = 2.00;
                tipoAuto = "Vehiculo liviano particular";
                break;

            case 2:
                porcentaje = avaluo * 0.0002;
                valor = 2.50;
                tipoAuto = "Vehiculo grande particular";
                break;

            case 3:
                porcentaje = avaluo * 0.0004;
                valor = 1.50;
                tipoAuto = "Taxi";
                break;

            case 4:
                porcentaje = avaluo * 0.0005;
                valor = 2.20;
                tipoAuto = "Bus Urbano";
                break;

            default:
                System.out.println("Tipo de vehiculo no valido");
                break;
        }
        
        if ((opcion == 1 || opcion == 2) && (avaluo > 30000)) {
            recargo = 1.50;
        }
        
        valorTotal = porcentaje + valor + recargo;
        
        System.out.printf("\nPEAJE BUENA VIDA\n"
                + "Propietario: %s\n"
                + "Tipo: %s\n"
                + "     Avalúo: %.2f\n"
                + "     Valor base del peaje: $%.2f\n"
                + "     Recargo: $%.2f\n\n"
                + "     Total a cancelar: $%.2f\n",
                nombre,
                tipoAuto,
                avaluo,
                valor,
                recargo,
                valorTotal);
    }
    
}
