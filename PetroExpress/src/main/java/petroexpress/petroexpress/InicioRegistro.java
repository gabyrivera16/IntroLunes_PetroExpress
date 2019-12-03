/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petroexpress.petroexpress;

/**
 *
 * @author 17adr
 */

import javax.swing.JOptionPane;

public class InicioRegistro {
    
  //inicio de usuarios y contrase;as 
   //Base de datos 
    
    public String usUno = "Adriana";
    public String usDos = "Nancy";
    public String usTres = "Carlos";
   
    public String clUno = "a12345";
    public String clDos = "n12345";
    public String clTres = "c12345";
   
    public String usCuatro = "";
    public String clCuatro = "";
    
    int salir = 2;
 
   
    public void Bienvenida() {
        
        JOptionPane.showMessageDialog(null, "¡Bienvenid@ a PetroExpress! Gracias por preferirnos.");
        
    }//fin de bienvenida
    
    public void Registro() {
      
     int confirm = JOptionPane.showConfirmDialog(null, "Se encuentra registrado?" ,"Bienvenid@!", JOptionPane.YES_NO_OPTION);
     
     do {
           
       //inicio de opciones
   
      
         opcionRegistro(confirm);
    
      }  while(confirm == 2 ); //final de do while
        
     
        
    }//final de Registro    
    
    public void opcionRegistro(int opc){
        switch(opc) {
        
         //Si
          case 0: 
        
         JOptionPane.showMessageDialog(null, "¡Bienvenid@ al modulo de Registro!"); 
           
        String usuario = "Por favor, ingresar nombre de usuario: ";  
        String usuario1 = JOptionPane.showInputDialog(usuario);

        String clave = "Escriba su clave: ";  
        String clave1 = JOptionPane.showInputDialog(clave);
        
            if(usuario1.equals(usUno)&& clave1.equals(clUno)) {
        
        JOptionPane.showMessageDialog(null, "Usuario y clave correctos. Bienvenido a PetroExpress.");         
              
            }//final de if
          
        break;
         
          case 1:
        JOptionPane.showMessageDialog(null, "Por favor, ingrese nuevo nombre de usuario: "); 
        String usuario4 = "Nuevo usuario: ";  
        String usCuatro = JOptionPane.showInputDialog(usuario4);
        
          
        JOptionPane.showMessageDialog(null, "Por favor, ingrese nueva clave: ");
           String clave4 = "Nueva clave: ";  
           String clCuatro= JOptionPane.showInputDialog(clave4);
             
        JOptionPane.showMessageDialog(null, "Usted se ha registrado satisfactoriamente!! Por favor, ingrese su usuario y clave de nuevo: ");  
           
        String nvUsuario = "Ingresar nombre de usuario: ";  
        String usuarioNv = JOptionPane.showInputDialog(nvUsuario);

        String nvClave = "Ingresar su clave: ";  
        String claveNv = JOptionPane.showInputDialog(nvClave);
        
           
        if(usuarioNv.equals(usCuatro)&& claveNv.equals(clCuatro)) {    
             
       JOptionPane.showMessageDialog(null, "Usuario y clave correctos. Bienvenido a PetroExpress.");
       
        }//final de if2
        else {
        
        JOptionPane.showMessageDialog(null, "Usuario y clave incorrectos. Intente de nuevo.");
        
        }
       
              System.out.println(" " +opc);
        break;
      
              
      }//final de switch
   
    }//final opcionregistro
    
}//final de InicioRegistro
