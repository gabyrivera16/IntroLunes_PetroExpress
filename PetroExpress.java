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
public class PetroExpress {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
      InicioRegistro registro = new InicioRegistro();
      registro.Bienvenida();
      registro.Registro();
      
      TransporteGasolina gasolina = new TransporteGasolina();
      gasolina.Bienvenida2();
      gasolina.IngresoDatos();
      gasolina.MenuGasolina();
    
    }//final de main
    
}//final de clase
