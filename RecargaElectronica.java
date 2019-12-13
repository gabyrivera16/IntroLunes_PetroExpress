/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petroexpress.petroexpress;

import java.util.Scanner;

/**
 *
 * @author 17adr
 */
public class RecargaElectronica {
    Scanner leer = new Scanner(System.in);
    int opcion = 0;
    int cantidad = 0;
    int vehiculos = 0;
    String lugar;
    public void Menu(){
        do{
        System.out.println("Seleccione su plan de recarga eléctrica");
            System.out.println("1.Recarga Convencional \n2.Recarga Semi-Rápida"
                    + " \n3.Recarga Rápida \n0.Salir");
            opcion = leer.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Digite la cantidad de la recarga:");
                cantidad = leer.nextInt();
                System.out.println("Digite cuántos vehiculos desea recargar:");
                vehiculos = leer.nextInt();
                System.out.println("Digite dónde desea realizar su recarga:");
                lugar = leer.nextLine();
                System.out.println("Recarga Convencional: Cantidad Recarga: "
                +cantidad+" Vehículos: "+vehiculos+" Lugar de Recarga: "+lugar);
                break;
                
            case 2: 
                System.out.println("Digite la cantidad de la recarga:");
                cantidad = leer.nextInt();
                System.out.println("Digite cuántos vehiculos desea recargar:");
                vehiculos = leer.nextInt();
                System.out.println("Digite dónde desea realizar su recarga:");
                lugar = leer.nextLine();
                System.out.println("Recarga Semi-Rápida: Cantidad Recarga: "
                +cantidad+" Vehículos: "+vehiculos+" Lugar de Recarga: "+lugar);
                break;
                
            case 3:
                System.out.println("Digite la cantidad de la recarga:");
                cantidad = leer.nextInt();
                System.out.println("Digite cuántos vehiculos desea recargar:");
                vehiculos = leer.nextInt();
                System.out.println("Digite dónde desea realizar su recarga:");
                lugar = leer.nextLine();
                System.out.println("Recarga Rápida: Cantidad Recarga: "
                +cantidad+" Vehículos: "+vehiculos+" Lugar de Recarga: "+lugar);
                break;
                
        }//fin switch
        }while(opcion!=0);           
    
    }
    
}//final de RecargaElectronica
