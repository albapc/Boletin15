
package boletin15;

import javax.swing.JOptionPane;

public class Factura {
    private int numero = 0;
    private Producto producto1 = new Producto("C1", 24);
    private Producto producto2 = new Producto("H23", 234);
    private Producto producto3 = new Producto("M30", 109);

    public Factura() {

    }

    public Factura(int numero) {
        this.numero = numero;
    }
    
        public int getNumero() {
        return numero;
    }

    public Producto getProducto1() {
        return producto1;
    }

    public Producto getProducto2() {
        return producto2;
    }

    public Producto getProducto3() {
        return producto3;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setProducto1(Producto producto1) {
        this.producto1 = producto1;
    }

    public void setProducto2(Producto producto2) {
        this.producto2 = producto2;
    }

    public void setProducto3(Producto producto3) {
        this.producto3 = producto3;
    }

    public void hacerFactura() {
        numero++;
        System.out.println("Factura: " + numero);

        System.out.println("Producto 1:\n" + "Codigo: " + producto1.getCodigo() + "\nPrecio: " + producto1.getPrecio() + " euros\n");
        System.out.println("Producto 2:\n" + "Codigo: " + producto2.getCodigo() + "\nPrecio: " + producto2.getPrecio() + " euros\n");
        System.out.println("Producto 3:\n" + "Codigo: " + producto3.getCodigo() + "\nPrecio: " + producto3.getPrecio() + " euros\n");

    }

    public void modificarProducto2() {

        producto2.setCodigo("k123");

        producto2.setPrecio(247);

    }
    
    public void hacerFacturaException() throws CodigoException {       
        char cp1 = producto1.getCodigo().charAt(1);
        char cp2 = producto2.getCodigo().charAt(1);
        char cp3 = producto3.getCodigo().charAt(1);
        
        if(Character.isDigit(cp1) == false){
            throw new CodigoException("ERROR producto 1: los dos ultimos caracteres deben ser numeros");
        }

        if(Character.isDigit(cp2) == false){
            throw new CodigoException("ERROR producto 1: los dos ultimos caracteres deben ser numeros");
        }
        
        if(Character.isDigit(cp3) == false){
            throw new CodigoException("ERROR producto 1: los dos ultimos caracteres deben ser numeros");
        }
        
        if (((producto1.getCodigo().charAt(0)) >= 'a' && (producto1.getCodigo().charAt(0)) <= 'z') || ((producto1.getCodigo().charAt(0)) >= 'A' && ((producto1.getCodigo().charAt(0)) <= 'Z')))
            System.out.println("Producto 1:\n" + "Codigo: " + producto1.getCodigo() + "\nPrecio: " 
                    + producto1.getPrecio() + " euros\n");
        else
            throw new CodigoException("ERROR producto 1: el primer caracter debe ser una letra");
        
        if (((producto2.getCodigo().charAt(0)) >= 'a' && (producto2.getCodigo().charAt(0)) <= 'z') || ((producto2.getCodigo().charAt(0)) >= 'A' && ((producto2.getCodigo().charAt(0)) <= 'Z')))
            System.out.println("Producto 2:\n" + "Codigo: " + producto2.getCodigo() + "\nPrecio: " 
                    + producto2.getPrecio() + " euros\n");
        else
            throw new CodigoException("ERROR producto 2: el primer caracter debe ser una letra");
        
        if (((producto3.getCodigo().charAt(0)) >= 'a' && (producto3.getCodigo().charAt(0)) <= 'z') || ((producto3.getCodigo().charAt(0)) >= 'A' && ((producto3.getCodigo().charAt(0)) <= 'Z')))
            System.out.println("Producto 3:\n" + "Codigo: " + producto2.getCodigo() + "\nPrecio: " 
                    + producto3.getPrecio() + " euros\n");
        else
            throw new CodigoException("ERROR producto 3: el primer caracter debe ser una letra");
        
        
    }
    
    
    
}
    


