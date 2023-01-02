

public abstract class Visualizer{
    protected static final String black = "\u001B[30m";
    protected static final String red = "\u001B[31m";
    protected static final String green = "\u001B[32m";
    protected static final String yellow = "\u001B[33m";
    protected static final String blue = "\u001B[34m";
    protected static final String purple = "\u001B[35m";
    protected static final String cyan = "\u001B[36m";
    protected static final String white = "\u001B[37m";
    protected static final String blckBg = "\u001B[40m";
    protected static final String redBg = "\u001B[41m";
    protected static final String greenBg = "\u001B[42m";
    protected static final String yellowBg = "\u001B[43m";
    protected static final String blueBg = "\u001B[44m";
    protected static final String purpleBg = "\u001B[45m";
    protected static final String cyanBg = "\u001B[46m";
    protected static final String whiteBg = "\u001B[47m";

    protected static final String reset = "\u001B[0m";

    public Visualizer(){
        
    }
    
    protected abstract void imprimirTabla();

    /**
    *    Vendedor vendedor = vendedores.get(0);
    *    String nombre = vendedor.getNombre();
    *    int ventas = vendedor.getMontoVendido();
    *   String producto = vendedor.getProducto();
    *    System.out.println();
    *    System.out.println("Vendedor \t       " + "Ventas \t" + "Producto");
    *    System.out.println(nombre + "\t \t    " + ventas + "\t \t" + producto);
    }**/
}