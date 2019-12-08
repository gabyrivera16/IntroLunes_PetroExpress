/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petroexpress.petroexpress;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author 17adr
 */
public class TransporteGasolina {
 
  //Base de datos
   public int L = 0;
   public double sumPrecio = 0;
   public double sumLit = 0;  
   public double regularPre = 877.12;
   public double diesPre = 734.20;
   public double plusPre = 635.13;
     
   //Choferes
   public String choferUno = "Roberto Morales";
   public String cedRob = "116984598";
   public String placaUno = "CP12897";
   
   public String choferDos = "Amelia Rodriguez";
   public String cedAme = "114326820";
   public String placaDos = "CP29031";
   
   public String choferTres = "Armando Gonzalez";
   public String cedArm = "559273174";
   public String placaTres = "CP57623";
   
 public void Bienvenida2() {
     
  JOptionPane.showMessageDialog(null, "Bienvenido al modulo de transporte.");
     
 }//final de bienvenida2   
 
 
 public void IngresoDatos() {
     
 JOptionPane.showMessageDialog(null, "Por favor, ingresar datos requeridos.", "" , JOptionPane.QUESTION_MESSAGE);
 
 String fecha = "Ingrese fecha de pedido: ";
 String fechaped = JOptionPane.showInputDialog(fecha);
     System.out.println(" "+fecha);
 String destino = "Ingrese destino de producto: ";
 String destinoped = JOptionPane.showInputDialog(destino);
     System.out.println(" "+destino);

String compartimiento = "Ingrese numero de compartimiento en la cisterna(1 al 4).";
String comparnum = JOptionPane.showInputDialog(compartimiento);
     System.out.println(" "+comparnum);     
     
     
 }//final de IngresoDatos

 public void MenuGasolina() {

 Scanner numero = new Scanner(System.in);
 int opcion = 0;

 do {
      JOptionPane.showMessageDialog(null, "Que tipo de gasolina desea comprar?");
  
     System.out.println("1.Regular-Super \n 2.Diesel \n 3.Plus 91 \n 0.Salir \n");
     opcion = numero.nextInt();
           
        switch(opcion) {
            
            case 1: //Regular-Super
    
                System.out.println("Ingrese cantidad de litros a solicitar");    
       L = numero.nextInt();
       double tprecio = regularPre * L;     
                System.out.println("Su pedido es Regular Super");
                System.out.println("Su chofer es: " +choferUno);   
                System.out.println("Cedula juridica de chofer: " +cedRob);
                System.out.println("Placa de camion: " +placaUno);
                System.out.println("Monto total: " +tprecio);
                System.out.println("Cantidad de litros solicitados: " +L);
            
      break;
            
            case 2: //Diesel
            
                System.out.println("Ingrese cantidad de litros a solicitar");    
       L = numero.nextInt();
       double tprecio2 = diesPre * L;     
                System.out.println("Su pedido es Diesel");
                System.out.println("Su chofer es: " +choferDos);   
                System.out.println("Cedula juridica de chofer: " +cedAme);
                System.out.println("Placa de camion: " +placaDos);
                System.out.println("Monto total: " +tprecio2);
                System.out.println("Cantidad de litros solicitados: " +L);
                
            break;
           
            case 3: //Plus 91
   
               System.out.println("Ingrese cantidad de litros a solicitar");    
       L = numero.nextInt();
       double tprecio3 = diesPre * L;     
                System.out.println("Su pedido es Plus91");
                System.out.println("Su chofer es: " +choferTres);   
                System.out.println("Cedula juridica de chofer: " +cedArm);
                System.out.println("Placa de camion: " +placaTres);
                System.out.println("Monto total: " +tprecio3);
                System.out.println("Cantidad de litros solicitados: " +L);
                
            break;
            
           }//fin de switch
           
    } while(opcion == 0 );
     
     
     
 }//final de MenuGasolina
    
    
}//final de TransporteGasolina 
