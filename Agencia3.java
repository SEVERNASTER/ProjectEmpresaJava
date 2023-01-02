
import java.util.ArrayList;
public class Agencia3 extends Agencia2{

    public Agencia3(){

    }

    @Override
    protected void imprimirTabla(){
        int numero = 1;
        System.out.println("\t \t       Agencia 3");
        System.out.println("\t  Vendedor \t \t" + "Ventas \t \t" + "Producto");
        System.out.println("\t ------------------------------------------------");
        ArrayList<Vendedor> vendedores = vendedor;
        for(Vendedor e : vendedores){
            if(e.getNombre().length() >= 1 && e.getNombre().length() < 6){
                System.out.println("\t " + numero + ")" + e.getNombre() + "\t \t \t" + e.getMontoVendido() + "\t \t" + e.getProducto());
                numero++; 
            }else if(e.getNombre().length() >= 6 && e.getNombre().length() < 14){
                System.out.println("\t " + numero + ")" + e.getNombre() + "\t \t" + e.getMontoVendido() + "\t \t" + e.getProducto());
                numero++;
            }else if(e.getNombre().length() >= 14 && e.getNombre().length() < 22){
                System.out.println("\t " + numero + ")" + e.getNombre() + "\t" + e.getMontoVendido() + "\t \t" + e.getProducto());
                numero++;
            }
        }
        System.out.println();
    }
}

