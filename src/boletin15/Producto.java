
package boletin15;

public class Producto {
    private String codigo;
    private float precio;

    public Producto() {

    }

    public Producto(String codigo, float precio) {
        this.codigo = codigo;
        this.precio = precio;
    } 

    public String getCodigo() {
        return codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}

