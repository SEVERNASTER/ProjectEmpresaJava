
//empezamos 21 dic 2022
import java.util.ArrayList;
public class Agencia1 extends Visualizer{
    protected ArrayList<String> productos;
    protected ArrayList<Vendedor> vendedor;
    protected Vendedor posMenor;
    protected Vendedor posMayor;
    protected int tiposProductos;
    protected Visualizer visualizer;
    private String nombreBuscado;// usado solamente en el metodo imprimirTablaMarcado

    public Agencia1(){
        productos = new ArrayList<String>();
        vendedor = new ArrayList<Vendedor>();
        posMenor = null;
        posMayor = null;
        tiposProductos = 0;
        nombreBuscado = "";
    }    

    public void addVendedor(String nombre, int montoVendido, String producto){
        this.tiposProductos += verificarTiposProductos(producto); 
        productos.add(producto);
        Vendedor trabajador = new Vendedor(nombre, montoVendido, producto);
        vendedor.add(trabajador);

    }

    public String promedioGanancias(){
        String res = "";
        int acumulado = 0;
        if(vendedor.size() != 0){
            for(Vendedor e : vendedor){
                acumulado += e.getMontoVendido();
            }
            acumulado /= vendedor.size();
            res = yellow + "Promedio de ventas: " + acumulado + reset;
        }else{
            res = redBg + "No hay ningun vendedor registrado en esta agencia" + reset;
        }
        return res;
    }

    public String ventaMayor(){
        int mayor = 0;
        for(Vendedor e : vendedor){
            if(e.getMontoVendido() > mayor){
                mayor = e.getMontoVendido();
                posMayor = e;
            }
        }
        return mayor();
    }

    public String ventaMenor(){
        int menor = 10000000;
        for(Vendedor e : vendedor){
            if(e.getMontoVendido() < menor){
                menor = e.getMontoVendido();
                posMenor = e;
            }
        }
        return menor();
    } 

    private String menor(){
        String estado = "";
        if(vendedor.size() != 0){
            estado = yellow + "El precio menor es de " + reset + purple +  posMenor.getNombre() + reset + yellow + " que ha vendido " + reset + purple + posMenor.getMontoVendido() + reset + yellow + " en productos de " + reset + purple + posMenor.getProducto() + reset;
        }else{
            estado = redBg + "No hay ningun vendedor registrado en esta agencia" + reset;
        }
        return estado;
    }

    private String mayor(){
        String estado = "";
        if(vendedor.size() != 0){
            estado = yellow + "El precio mayor es de " + reset + purple + posMayor.getNombre() + reset + yellow + " que ha vendido " + reset + purple + posMayor.getMontoVendido() + reset + yellow + " en productos de " + reset + purple + posMayor.getProducto() + reset;
        }else{
            estado = redBg + "No hay ningun vendedor registrado en esta agencia" + reset;
        }
        return estado;
    }

    private int verificarTiposProductos(String producto){
        int tipos = 0;
        if(productos.contains(producto)){

        }else{
            tipos++;
        }
        return tipos;
    }

    public int getTiposDeProductos(){
        return tiposProductos;
    }

    protected ArrayList<String> getArrayProductos(){
        return productos;
    }

    public void despedirEmpleado(int numEmpleado){
        vendedor.remove(numEmpleado - 1);
    }

    public ArrayList<Vendedor> getArrayVendedor(){
        return vendedor;
    }
    
    @Override
    protected void imprimirTabla(){//talvez deba ser public
        int numero = 1;
        System.out.println("\t \t \t       " + red + "Agencia 1" + reset);
        System.out.println();
        System.out.println("\t  " + blueBg + "Vendedor" + reset + "\t \t" + blueBg + "Ventas" + reset + "\t \t" + blueBg + "Producto" + reset + reset);
        System.out.println(blue + "\t -----------------------------------------------" + reset);
        ArrayList<Vendedor> vendedores = vendedor;
        for(Vendedor e : vendedores){//la condicional de abajo es para saber cuántas tabulaciones debemos poner según el "tamaño" del nombre
            if(e.getNombre().length() >= 1 && e.getNombre().length() < 6){
                System.out.println("\t" + cyan + numero + ")" + reset + e.getNombre() + "\t \t \t" + e.getMontoVendido() + "\t \t" + e.getProducto());
                numero++; 
            }else if(e.getNombre().length() >= 6 && e.getNombre().length() < 14){
                System.out.println("\t" + cyan + numero + ")" + reset + e.getNombre() + "\t \t" + e.getMontoVendido() + "\t \t" + e.getProducto());
                numero++;
            }else if(e.getNombre().length() >= 14 && e.getNombre().length() < 22){
                System.out.println("\t" + cyan + numero + ")" + reset +e.getNombre() + "\t" + e.getMontoVendido() + "\t \t" + e.getProducto());
                numero++;
            }
        }
        System.out.println();
    }

    protected void imprimirTablaMarcado(){
        int numero = 1;
        System.out.println("\t \t \t       " + red + "Agencia 1" + reset);
        System.out.println();
        System.out.println("\t  " + blueBg + "Vendedor" + reset + "\t \t" + blueBg + "Ventas" + reset + "\t \t" + blueBg + "Producto" + reset);
        System.out.println(blue + "\t -----------------------------------------------" + reset);
        ArrayList<Vendedor> vendedores = vendedor;
        for(Vendedor e : vendedores){
            if(e.getNombre().equalsIgnoreCase(this.nombreBuscado)){
                if(e.getNombre().length() >= 1 && e.getNombre().length() < 6){
                    System.out.println("\t" + cyan + numero + ")" + reset + redBg + e.getNombre() + "\t \t \t" + e.getMontoVendido() + "\t \t" + e.getProducto() + reset);
                    numero++; 
                }else if(e.getNombre().length() >= 6 && e.getNombre().length() < 14){
                    System.out.println("\t" + cyan + numero + ")" + reset + redBg + e.getNombre() + "\t \t" + e.getMontoVendido() + "\t \t" + e.getProducto() + reset);
                    numero++;
                }else if(e.getNombre().length() >= 14 && e.getNombre().length() < 22){
                    System.out.println("\t" + cyan + numero + ")" + reset + redBg + e.getNombre() + "\t" + e.getMontoVendido() + "\t \t" + e.getProducto() + reset);
                    numero++;
                }
            }else{
                if(e.getNombre().length() >= 1 && e.getNombre().length() < 6){
                    System.out.println("\t" + cyan + numero + ")" + reset + e.getNombre() + "\t \t \t" + e.getMontoVendido() + "\t \t" + e.getProducto());
                    numero++; 
                }else if(e.getNombre().length() >= 6 && e.getNombre().length() < 14){
                    System.out.println("\t" + cyan + numero + ")" + reset + e.getNombre() + "\t \t" + e.getMontoVendido() + "\t \t" + e.getProducto());//esta linea esta editada
                    numero++;
                }else if(e.getNombre().length() >= 14 && e.getNombre().length() < 22){
                    System.out.println("\t" + cyan + numero + ")" + reset +e.getNombre() + "\t" + e.getMontoVendido() + "\t \t" + e.getProducto());
                    numero++;
                }
            }
        }
    }

    protected void setNombreBuscado(String nombre){
        nombreBuscado = nombre;
    }

    protected String getNombreBuscado(){
        return nombreBuscado;
    }

}


