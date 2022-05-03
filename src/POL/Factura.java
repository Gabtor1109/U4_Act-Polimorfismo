/*
 Se crea java class factura para hacer uso de interface
 */

package POL;

public class Factura {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;
    
    //Se crea constructor
    public Factura(String pieza, String descripcion,int cant, double precio){
        numeroPieza = pieza;
        descripcionPieza = descripcion;
        //Se llaman los metodos
        establecerCantidad(cant);
        establecerPrecioPorArticulo(precio);
    }
    
    // Se desarrollan metodos get/set para el resto de las variables    
    public void establecerNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }
    
    public String obtenerNumeroPieza() {
        return numeroPieza;
    }

    public void establecerDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public String obtenerDescripcionPieza() {
        return descripcionPieza;
    }

    public void establecerCantidad(int cantidad) {
        if(cantidad >=0)
            this.cantidad = cantidad;
        else 
            throw new IllegalArgumentException("La cantidad debe ser mayor o igual a cero");
    }

    public int obtenerCantidad() {
        return cantidad;
    }

    public void establecerPrecioPorArticulo(double precioPorArticulo) {
        if(precioPorArticulo >= 0.0)
            this.precioPorArticulo = precioPorArticulo;
        else
            throw new IllegalArgumentException("El Precio por Articulo debe ser mayor o igual a cero");
    }
        
    public double obtenerPrecioPorArticulo() {
        return precioPorArticulo;
    }

    @Override
    public String toString() {
        return String.format("%s:\n%s(%s)\n%s: %d \n%s: $%,.2f", "Factura","Numero de pieza",obtenerNumeroPieza(),obtenerDescripcionPieza(),"Cantidad",obtenerCantidad(),"Precio Por Articulo", obtenerPrecioPorArticulo());
    }
    
    @Override
    public double obtenerMontoPago(){
        //Se calcula el costo total
        return obtenerCantidad()*obtenerPrecioPorArticulo();
    }
    
}
