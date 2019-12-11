
package MetodoPago;

import javax.swing.JOptionPane;

public class MetodoPago {

    public static void main(String[] args) {
        
    //inicializacion de variables
        float desc=0;
        float sumprecio=0;
        String firma="";
        //Imprimir: Bienvenido al módulo de métodos de pago
        JOptionPane.showMessageDialog(null, "Bienvendo al módulo de métodos de pago.");
        
        //Imprimir: Según el método de pago utilizado para la cotización, se le aplica un descuento sobre efectivo 10%, SInPE un 5% y Paypal un 2%
        JOptionPane.showMessageDialog(null,"Según el método de pago utilizado para la cotización, se le aplica un descuento: sobre efectivo 10%, SINPE un 5% y Paypal un 2%");
        
        //Imprimir elegir
        String pago = JOptionPane.showInputDialog(null,"Elija la opción escribiendo la letra correspondiente al método de pago (use mayúsculas): A. Efectivo B. SINPE C. Paypal D. Tarjeta de crédito o débito. ");

        //switch de metodo de pago
        switch(pago){
            case "A":
                JOptionPane.showMessageDialog(null,"Al pagar en efectivo tiene un 10% de descuento.");
                desc=(float) (sumprecio*0.1);
                firma = JOptionPane.showInputDialog(null,"Firma digital: ");
                break;
            case "B":
                JOptionPane.showMessageDialog(null,"Al pagar con SINPE tiene un 5% de descuento");
                desc=(float) (sumprecio*0.05);
                firma = JOptionPane.showInputDialog(null,"Firma digital: ");
                break;
            case "C":
                JOptionPane.showMessageDialog(null,"Al pagar con paypal tiene un 2% de descuento.");
                desc=(float) (sumprecio*0.02);
                firma = JOptionPane.showInputDialog(null,"Firma digital: ");
                break;
            case "D":
                JOptionPane.showMessageDialog(null,"Se ha procesado su pago por medio de tarjeta.");
                firma = JOptionPane.showInputDialog(null,"Firma digital: ");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Usted no seleccionó una opción válida","Error",0);
        }//fin switch
        
        //parte de IMPRIMIR RECIBO
        
    }//fin main
    
}//fin clase
