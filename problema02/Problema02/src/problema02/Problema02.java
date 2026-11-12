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
        double porcentaje;
        double valor;
        
        System.out.println("Ingrese su nombre:");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el avalúo del vehiculo:");
        avaluo = entrada.nextDouble();
        
        System.out.println("Ingrese la clasificacion de su vehiculo.\n"
                + "1 Vehículo liviano particular\n"
                + "2 Vehiculo grande particular\n"
                + "3 Taxi\n"
                + "4 Bus urbano\n");
        
        switch (opcion) {
                case 1 ->
                    porcentaje = 0.0001;
                    valor = 2.00;
  
                case 2 ->
                   
                case 3 ->
                    

                case 4 ->
                    
                    
                default ->
                    System.out.println("ninguna de las opciones anteriores es "
                            + "correcta");
        }
            
            
        }
        
        
        
        
        
        
        
        
       
    }
    
}
