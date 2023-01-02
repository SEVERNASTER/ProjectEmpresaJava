
public class Vendedor{
    private String nombre;
    private int montoVendido;
    private String producto;
    
    public Vendedor(String nombre, int montoVendido, String producto){
        this.nombre = nombre;
        this.montoVendido = montoVendido;
        this.producto = producto;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getProducto(){
        return producto;
    }
    
    public int getMontoVendido(){
        return montoVendido;
    }
    
    
}