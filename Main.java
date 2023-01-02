import java.util.Scanner;

public class Main extends Colores {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Scanner sc = new Scanner(System.in);
        System.out.println(purple + "\t \t \t \t \t *******************************" + reset);
        System.out.println(purple + "\t \t \t \t \t *     " + reset + "Bienvenido a " + blue + "JQuery" + reset + purple
                + "     *" + reset);
        System.out.println(purple + "\t \t \t \t \t *******************************" + reset);
        System.out.println(green + "\t Que deseas hacer?" + reset);
        boolean menuActivo = true;
        while (menuActivo) {
            System.out.println(red + "\t 1)" + reset + "Agregar vendedor");
            System.out.println(red + "\t 2)" + reset + "Obtener el promedio de ganacias");
            System.out.println(red + "\t 3)" + reset + "Obtener la venta mayor");
            System.out.println(red + "\t 4)" + reset + "Obtener la venta menor");
            System.out.println(red + "\t 5)" + reset + "Cuantos tipos de productos hay?");
            System.out.println(red + "\t 6)" + reset + "Despedir empleado");
            System.out.println(red + "\t 7)" + reset + "Imprimir tabla");
            System.out.println(red + "\t 8)" + reset + "Salir");
            System.out.println();

            System.out.print(green + "\t Respuesta: " + reset);
            int opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1: // hay un problema y es que lanza error cuando le das un texto con espacios
                        // esto se puede solucionar con nextLine pero cuando le pones eso no espera
                        // para leer la respuesta
                    System.out.print(purple + "\t Número de la agencia: " + reset);
                    int agencia = sc.nextInt();
                    System.out.print(purple + "\t Nombre del vendedor: " + reset);
                    String nombre = sc.next();
                    System.out.print(purple + "\t Monto vendido: " + reset);
                    int ventas = sc.nextInt();
                    System.out.print(purple + "\t Producto: " + reset);
                    String producto = sc.next();
                    System.out.println();
                    empresa.agregarVendedor(agencia, nombre, ventas, producto);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("\t " + purple + "Ingresa el número de la Agencia: " + reset);
                    int numAgencia2 = sc.nextInt();
                    System.out.println();
                    System.out.println("\t " + empresa.getPromedioGanancias(numAgencia2));
                    System.out.println();
                    break;
                case 3:
                    System.out.print("\t " + purple + "Ingresa el número de la agencia: " + reset);
                    int numAgencia3 = sc.nextInt();
                    System.out.println();
                    System.out.println("\t " + empresa.getVentaMayor(numAgencia3));
                    System.out.println();
                    break;
                case 4:
                    System.out.print("\t " + purple + "Ingresa el número de la agencia: " + reset);
                    int numAgencia4 = sc.nextInt();
                    System.out.println();
                    System.out.println("\t " + empresa.getVentaMenor(numAgencia4));
                    System.out.println();
                    break;
                case 5:
                    System.out.print("\t " + purple + "Ingresa el número de la Agencia: " + reset);
                    int numAgencia5 = sc.nextInt();
                    System.out.println();
                    System.out.println("\t " + empresa.getTiposDeProductos(numAgencia5));
                    System.out.println();
                    break;
                case 6:
                    System.out.print("\t " + purple + "Ingresa el numero de la agencia: " + reset);
                    int numAgencia6 = sc.nextInt();
                    System.out.println();
                    System.out.println("\t " + purple + "Cómo quieres despedir al empleado?: " + reset);
                    System.out.println("\t " + red + "1)" + reset + "Ingresando su número en la tabla.");
                    System.out.println("\t " + red + "2)" + reset + "Ingresando su nombre.");
                    System.out.println("\t " + red + "3)" + reset + "Salir.");
                    System.out.print("\t " + green + "Respuesta: " + reset);
                    int res = sc.nextInt();
                    switch (res) {
                        case 1:
                            boolean eligiendo = true;
                            while (eligiendo) {
                                empresa.imprimirTabla(numAgencia6);
                                System.out.println();
                                System.out
                                        .print("\t " + purple + "Ingresa el número del empleado a despedir: " + reset);
                                int despedido = sc.nextInt();
                                String res2 = empresa.encontrarNombre(numAgencia6, despedido - 1);
                                System.out.println();
                                empresa.imprimirTablaMarcado(numAgencia6);
                                System.out.println();
                                System.out.println("\t " + purple + "Estás seguro/a de que quieres despedir a " + reset
                                        + red + empresa.getNombreBuscado(numAgencia6) + reset + purple + " ??" + reset);
                                System.out.println("\t " + red + "1)" + reset + "Confirmar");
                                System.out.println("\t " + red + "2)" + reset + "Volver a elegir");
                                System.out.print("\t " + green + "Respuesta: " + reset);
                                int res3 = sc.nextInt();
                                switch (res3) {
                                    case 1:

                                        empresa.despedirVendedor(numAgencia6, despedido);
                                        System.out.println();
                                        empresa.imprimirTabla(numAgencia6);
                                        System.out.println("\t " + res2);
                                        System.out.println();
                                        eligiendo = false;
                                        break;
                                    case 2:
                                        break;
                                    default:
                                        break;
                                }
                            }

                    }
                    break;

                case 7:
                    System.out.print("Dame el numero de agencia: ");
                    int numAgencia = sc.nextInt();
                    empresa.imprimirTabla(numAgencia);
            }
        }
    }
}
