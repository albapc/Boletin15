
package boletin15;

import javax.swing.JOptionPane;

public class Boletin15 {

    public static void main(String[] args) {
        Factura factura1 = new Factura();

//        factura1.hacerFactura();
//        factura1.modificarProducto2();
//        factura1.hacerFactura();
          
    try{
        factura1.getProducto1().setCodigo(JOptionPane.showInputDialog("P1: Introduce un codigo"));
        factura1.getProducto2().setCodigo(JOptionPane.showInputDialog("P2: Introduce un codigo"));
        factura1.getProducto3().setCodigo(JOptionPane.showInputDialog("P3: Introduce un codigo"));
        factura1.hacerFacturaException();
    } catch(CodigoException e){
        System.out.println(e.getMessage());
    }

    }
    
}
