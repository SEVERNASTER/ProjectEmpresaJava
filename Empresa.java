
public class Empresa{//hacer un metodo que te diga que estas registrando dos veces a la misma persona
    private Metodos metodos;

    public Empresa(){
        metodos = new Metodos();
    }
    
    public void agregarVendedor(int numAgencias, String nombre, int ventas, String producto){
        metodos.agregarVendedor(numAgencias, nombre, ventas, producto);
    }
    
    public String getPromedioGanancias(int numAgencia){
        return metodos.getPromedioGanancias(numAgencia);
    }
    
    public String getVentaMayor(int numAgencia){
        return metodos.ventaMayor(numAgencia);
    }
    
    public String getVentaMenor(int numAgencia){
        return metodos.ventaMenor(numAgencia);
    }
    
    public String getTiposDeProductos(int numAgencia){
        return metodos.getTiposDeProductos(numAgencia);
    }
    
    public String despedirVendedor(int numAgencia, int numPos){
        return metodos.despedirEmpleado(numAgencia, numPos);
    }
    
    public void imprimirTabla(int numAgencia){
        metodos.imrpirmirTabla(numAgencia);
    }

    protected String encontrarNombre(int numAgencia, int numDespedido){
        return metodos.encontrarNombre(numAgencia, numDespedido);
    }

    protected void imprimirTablaMarcado(int numAgencia){
        metodos.imprimirTablaMarcado(numAgencia);
    }

    protected String getNombreBuscado(int numAgencia){
        return metodos.getNombreBuscado(numAgencia);
    }

    

    

}