import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Metodos extends Colores {
    protected Scanner sc;
    protected Agencia1 agencia1;
    protected Agencia2 agencia2;
    protected Agencia3 agencia3;
    protected Agencia4 agencia4;
    protected Query query;

    public Metodos() {
        sc = new Scanner(System.in);
        agencia1 = new Agencia1();
        agencia2 = new Agencia2();
        agencia3 = new Agencia3();
        agencia4 = new Agencia4();
        query = new Query();
    }

    public void agregarVendedor(int numAgencia, String nombre, int ventas, String producto) {
        // query.registrarVendedor(numAgencia);
        switch (numAgencia) {
            case 1:
                agencia1.addVendedor(nombre, ventas, producto);
                imrpirmirTabla(numAgencia);
                break;
            case 2:
                agencia2.addVendedor(nombre, ventas, producto);
                imrpirmirTabla(numAgencia);
                break;
            case 3:
                agencia3.addVendedor(nombre, ventas, producto);
                imrpirmirTabla(numAgencia);
                break;
            case 4:
                agencia4.addVendedor(nombre, ventas, producto);
                imrpirmirTabla(numAgencia);
                break;
            default:
                System.out.println("\t " + redBg + "El numero de agencia que ingresaste no existe" + reset);
        }
    }

    public String getPromedioGanancias(int numAgencias) {
        String res = "";
        switch (numAgencias) {
            case 1:
                res = agencia1.promedioGanancias();
                break;
            case 2:
                res = agencia2.promedioGanancias();
                break;
            case 3:
                res = agencia3.promedioGanancias();
                break;
            case 4:
                res = agencia4.promedioGanancias();
                break;
            default:
                res = redBg + "El numero de agencia que ingresaste no existe" + reset;
                break;
        }
        return res;
    }

    public String ventaMayor(int numAgencia) {
        String res = "";
        switch (numAgencia) {
            case 1:
                res = agencia1.ventaMayor();
                break;
            case 2:
                res = agencia2.ventaMayor();
                break;
            case 3:
                res = agencia3.ventaMayor();
                break;
            case 4:
                res = agencia4.ventaMayor();
                break;
            default:
                res = "El numero de agencia que ingresaste no existe";
                break;
        }
        return res;
    }

    public String ventaMenor(int numAgencia) {
        String res = "";
        switch (numAgencia) {
            case 1:
                res = agencia1.ventaMenor();
                break;
            case 2:
                res = agencia2.ventaMenor();
                break;
            case 3:
                res = agencia3.ventaMenor();
                break;
            case 4:
                res = agencia4.ventaMenor();
                break;
            default:
                res = "El numero de agencia que ingresaste no existe";
                break;
        }
        return res;
    }

    private boolean noHayProductos(int numAgencia) {
        boolean noHayProductos = true;
        switch (numAgencia) {
            case 1:
                if (agencia1.getArrayProductos().size() == 0) {
                    noHayProductos = true;
                } else {
                    noHayProductos = false;
                }
                break;
            case 2:
                if (agencia2.getArrayProductos().size() == 0) {
                    noHayProductos = true;
                } else {
                    noHayProductos = false;
                }
                break;
            case 3:
                if (agencia3.getArrayProductos().size() == 0) {
                    noHayProductos = true;
                } else {
                    noHayProductos = false;
                }
                break;
            case 4:
                if (agencia4.getArrayProductos().size() == 0) {
                    noHayProductos = true;
                } else {
                    noHayProductos = false;
                }
                break;
        }
        return noHayProductos;
    }

    private String cuantosProductos(ArrayList<String> productos) {
        String res = "";
        if (productos.size() == 1) {
            res = productos.get(0);
        } else {
            for (int i = 0; i < productos.size(); i++) {
                if (i == productos.size() - 1) { // el último
                    res += " y " + productos.get(i) + ".";
                } else if (i == productos.size() - 2) { // el penúltimo
                    res += productos.get(i);
                } else { // cualquier otra posición del arreglo
                    res += productos.get(i) + ", ";
                }
            }
        }
        return res;
    }

    public String getTiposDeProductos(int numAgencia) {// cuando hagamos el main hacer una opcion que pregunte si quiere
                                                       // ver los tipos de productos
        String res = "";
        int tiposDeProductos = 0;
        ArrayList<String> productos = null;
        if (numAgencia > 0 && numAgencia < 5) {
            if (noHayProductos(numAgencia)) {
                res = redBg + "No hay productos registrados en esta agencia" + reset;
            } else {
                switch (numAgencia) {
                    case 1:
                        tiposDeProductos = agencia1.getTiposDeProductos();
                        res = query.verificar(tiposDeProductos, numAgencia);
                        productos = agencia1.getArrayProductos();
                        res += purple + cuantosProductos(productos) + reset;
                        break;
                    case 2:
                        tiposDeProductos = agencia2.getTiposDeProductos();
                        res = query.verificar(tiposDeProductos, numAgencia);
                        productos = agencia2.getArrayProductos();
                        res += purple + cuantosProductos(productos) + reset;
                        break;
                    case 3:
                        tiposDeProductos = agencia3.getTiposDeProductos();
                        res = query.verificar(tiposDeProductos, numAgencia);
                        productos = agencia3.getArrayProductos();
                        res += purple + cuantosProductos(productos) + reset;
                        break;
                    case 4:
                        tiposDeProductos = agencia4.getTiposDeProductos();
                        res = query.verificar(tiposDeProductos, numAgencia);
                        productos = agencia4.getArrayProductos();
                        res += purple + cuantosProductos(productos) + reset;
                        break;
                    default:
                        break;

                }
            }
        } else {
            res = redBg + "El número de agencia que ingresaste no existe" + reset;
        }

        return res;
    }

    public String despedirEmpleado(int numAgencia, int numPos) {
        String res = "";
        switch (numAgencia) {
            case 1:
                ArrayList<Vendedor> vendedores1 = agencia1.getArrayVendedor();
                if (vendedores1.size() != 0) {
                    Vendedor vendedor1 = vendedores1.get(numPos - 1);
                    String nombre1 = vendedor1.getNombre();
                    res = nombre1 + " ha sido despedido/a";
                    agencia1.despedirEmpleado(numPos);
                } else {
                    res = "No hay vendedores registrados en esta agencia";
                }
                break;
            case 2:
                ArrayList<Vendedor> vendedores2 = agencia1.getArrayVendedor();
                if (vendedores2.size() != 0) {
                    Vendedor vendedor2 = vendedores2.get(numPos - 1);
                    String nombre2 = vendedor2.getNombre();
                    res = nombre2 + " ha sido despedido/a";
                    agencia1.despedirEmpleado(numPos);
                } else {
                    res = "No hay vendedores registrados en esta agencia";
                }
                break;
            case 3:
                ArrayList<Vendedor> vendedores3 = agencia1.getArrayVendedor();
                if (vendedores3.size() != 0) {
                    Vendedor vendedor3 = vendedores3.get(numPos - 1);
                    String nombre3 = vendedor3.getNombre();
                    res = nombre3 + " ha sido despedido/a";
                    agencia1.despedirEmpleado(numPos);
                } else {
                    res = "No hay vendedores registrados en esta agencia";
                }
                break;
            case 4:
                ArrayList<Vendedor> vendedores4 = agencia1.getArrayVendedor();
                if (vendedores4.size() != 0) {
                    Vendedor vendedor4 = vendedores4.get(numPos - 1);
                    String nombre4 = vendedor4.getNombre();
                    res = nombre4 + " ha sido despedido/a";
                    agencia1.despedirEmpleado(numPos);
                } else {
                    res = "No hay vendedores registrados en esta agencia";
                }
                break;
            default:
                res = "El número de agencia que ingresaste no existe";
        }
        return res;
    }

    public void imrpirmirTabla(int numAgencia) {
        switch (numAgencia) {
            case 1:
                agencia1.imprimirTabla();
                break;
            case 2:
                agencia2.imprimirTabla();
                break;
            case 3:
                agencia3.imprimirTabla();
                break;
            case 4:
                agencia4.imprimirTabla();
                break;
            default:
                System.out.println("El número de agencia que haz ingresado no existe");
                break;
        }
    }

    public void despedir2(int numAgencia) {
        interfaz(numAgencia);
    }

    public void interfaz(int numAgencia) {
        imrpirmirTabla(numAgencia);
        System.out.println();
        System.out.print("A qué empleado deseas despedir?: ");
        int numEmpleado = sc.nextInt();
        System.out.println();
        System.out.println(despedirEmpleado(numAgencia, numEmpleado));
        System.out.println();
        imrpirmirTabla(numAgencia);
    }

    protected String encontrarNombre(int numAgencia, int numDespedido) {
        String res = "";
        if (numAgencia >= 1 && numAgencia <= 4) {
            switch (numAgencia) {
                case 1:
                    ArrayList<Vendedor> vendedores1 = agencia1.getArrayVendedor();
                    Vendedor despedido1 = vendedores1.get(numDespedido);
                    res = purple + despedido1.getNombre() + reset;
                    break;
                case 2:
                    ArrayList<Vendedor> vendedores2 = agencia1.getArrayVendedor();
                    Vendedor despedido2 = vendedores2.get(numDespedido);
                    res = purple + despedido2.getNombre() + reset;
                    break;
                case 3:
                    ArrayList<Vendedor> vendedores3 = agencia1.getArrayVendedor();
                    Vendedor despedido3 = vendedores3.get(numDespedido);
                    res = purple + despedido3.getNombre() + reset;
                    break;
                case 4:
                    ArrayList<Vendedor> vendedores4 = agencia1.getArrayVendedor();
                    Vendedor despedido4 = vendedores4.get(numDespedido);
                    res = purple + despedido4.getNombre() + reset;
                    break;
            }
            setNombreBuscado(numAgencia, res);
            res += red + " ha sido despedido/a" + reset;
        } else {
            res = redBg + "El número de agencia que ingresaste no existe." + reset;
        }
        return res;
    }

    private void setNombreBuscado(int numAgencia, String nombre) {
        switch (numAgencia) {
            case 1:
                agencia1.setNombreBuscado(nombre);
                break;
            case 2:
                agencia2.setNombreBuscado(nombre);
                break;
            case 3:
                agencia3.setNombreBuscado(nombre);
                break;
            case 4:
                agencia4.setNombreBuscado(nombre);
                break;
            default:
                break;
        }
    }

    public void imprimirTablaMarcado(int numAgencia) {
        switch (numAgencia) {
            case 1:
                agencia1.imprimirTablaMarcado();
                break;
            case 2:
                agencia2.imprimirTablaMarcado();
                break;
            case 3:
                agencia3.imprimirTablaMarcado();
                break;
            case 4:
                agencia4.imprimirTablaMarcado();
                break;
            default:
                break;
        }
    }

    public String getNombreBuscado(int numAgencia){
        String nombreBuscado = "";
        switch (numAgencia) {
            case 1:
                nombreBuscado = agencia1.getNombreBuscado();
                break;
            case 2:
                nombreBuscado = agencia2.getNombreBuscado();
                break;
            case 3:
                nombreBuscado = agencia3.getNombreBuscado();
                break;
            case 4:
                nombreBuscado = agencia4.getNombreBuscado();
                break;
        }
        return nombreBuscado;
    }

    /*
     * public void verTabla(){
     * System.out.println("Agencia \t Nombre del Vendedor \t Ventas \t Prodcuto");
     * int posicion = 0;
     * int indice = 0;
     * boolean hayVendedores = indice < query.getArrayLength();
     * while(hayVendedores){
     * ArrayList<Integer> numAgencias = query.getArrayNumAgencias();
     * Agencia1 agencia = query.getAgencia(posicion);
     * 
     * ArrayList<Integer> posiciones = query.getArrayPosiciones();
     * posicion = posiciones.get(indice);
     * Agencia1 agencias = query.getAgencias(agencia);
     * Vendedor vendedor = agencias.get(posicion);
     * 
     * for(int numAgencia : numeroAgencias){
     * System.out.pritnln("Agencia " + numAgencia + "\t" + )
     * }
     * System.out.println("Agencia" + \t Dennis Zeballos \t 9200 \t \t Belleza");
     * 
     * posicion++;
     * indice++;
     * 
     * }
     * }
     */
}