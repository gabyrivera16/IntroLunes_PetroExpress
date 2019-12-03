/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.recibo;

import java.util.Scanner;
/**
 *
 * @author Carlos M
 */
public class RecyFact {
    
    public void Recibo (){ 
        
    int preciofin= 0;
    
        System.out.println("Fecha de pedido: "+fechaped);
        System.out.println("--------------------------");
        System.out.println("Nombre del plantel: "+plantel);
        System.out.println("----------------------------");
        System.out.println("Cantidad de litros solicitados: "+sumlit);
        System.out.println("---------------------------------------");
        System.out.println("Destino de entrega: "+destino);
        System.out.println("----------------------------");
        System.out.println("");
        
        Scanner firm= new Scanner(System.in);
        System.out.println("Ingrese firma digital: ");
        int firma= firm.nextInt();
        System.out.println("-----------------------");
        
        System.out.println("Su precio total en colones es: "+sumprecio+" con descuento de: "+desc);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Firmado por: "+firma);
        System.out.println("-------------------");
        System.out.println("Transacción finalizada, gracias por preferirnos");
        System.out.println("-----------------------------------------------");
        
        
        
    }//fin del metodo Rec
    
    public void FactElectro(){
        
        Scanner factelec= new Scanner(System.in);
        System.out.println("Si desea su factura impresa, digite 1. Y si desea que se enviada por email, digite 2.");
        int op= factelec.nextInt();
        
        if (op==2){
            
            
            
            
        }//fin del condicional
        
        
        
        
    }//fin del metodo FactElectro
    
    public void Rifa(){
        
        Scanner rifa= new Scanner(System.in);
        System.out.println("Si desea participar en nuestra rifa, digite 1. De lo contrario, digite 2");
        int resp= rifa.nextInt();
        
        if(resp==1){ 
            System.out.println("Ingrese un número del 1 al 10");
            int num= rifa.nextInt();
            
            switch (num){
                
                case 1:
                    System.out.println("");    
                    return;
                case 2:
                    System.out.println("");    
                    return;
                case 3:
                    System.out.println("");    
                    return;
                case 4:
                    System.out.println("");    
                    return;
                case 5:
                    System.out.println("");    
                    return;
                case 6:
                    System.out.println("");    
                    return;
                case 7:
                    System.out.println("");    
                    return;
                case 8:
                    System.out.println("");    
                    return;
                case 9:
                    System.out.println("");    
                    return;
                case 10:
                    System.out.println("");    
                    return;
                
            }//fin del switch
                
            
        }//fin de if 
        else{
            
          
            
            
        }//fin del else
        
    }//fin del metodo Rifa
    
    
}//fin de la clase RecyFact
