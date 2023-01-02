
public class Query extends Colores{

    public Query(){
        
    }
    
    public String verificar(int tiposDeProductos, int numAgencia){
        String res = "";
        if(tiposDeProductos > 0 && tiposDeProductos != 1){
            res = green + "La agencia " + reset + purple + "N°" + numAgencia + reset + green + " tiene " + reset + purple + tiposDeProductos + reset + green + " tipos de productos que son: " + reset;
        }else{
            res = green + "La agencia " + reset + purple + "N°" + numAgencia + reset + green + " tiene " + reset + purple + tiposDeProductos + reset + green + " tipo de producto que es: " + reset;
        }
        return res;
    }

}
/*import java.util.ArrayList;
public class Query{
private ArrayList<Agencia1> agencias;
private ArrayList<Integer> numAgencias;
private ArrayList<Integer> posiciones;
private int indice1;
private int indice2;
private int indice3;
private int indice4;

private Agencia1 agencia1;
private Agencia2 agencia2;
private Agencia3 agencia3;
private Agencia4 agencia4;

public Query(){
agencias = new ArrayList<Agencia1>();
numAgencias = new ArrayList<Integer>();
posiciones = new ArrayList<Integer>();
indice1 = -1;
indice2 = -1;
indice3 = -1;
indice4 = -1;
agencia1 = new Agencia1();
agencia2 = new Agencia2();
agencia3 = new Agencia3();
agencia4 = new Agencia4();
agregarAgencias();
}

public void registrarVendedor(int agencia){
switch(agencia){
case 1:
numAgencias.add(agencia);
indice1++;
posiciones.add(indice1);
case 2:
numAgencias.add(agencia);
indice2++;
posiciones.add(indice2);
case 3:
numAgencias.add(agencia);
indice3++;
posiciones.add(indice3);
case4:
numAgencias.add(agencia);
indice4++;
posiciones.add(indice4);
}
}

public ArrayList<Integer> getArrayNumAgencias(){
return numAgencias;
}

public ArrayList<Integer> getArrayPosiciones(){
return posiciones;
}

public int getArrayLength(){
return numAgencias.size();
}

private void agregarAgencias(){
agencias.add(agencia1);
agencias.add(agencia2);
agencias.add(agencia3);
agencias.add(agencia4);
}

public Agencia1 getAgencia(int numAgencia){
Agencia1 agencia = null;
switch(numAgencia){
case 1:
agencia = agencias.get(1);
break;
case 2:
agencia = agencias.get(2);
break;
case 3:
agencia = agencias.get(3);
break;
case 4:
agencia = agencias.get(4);
break;
default:
agencia = null;
break;
}
return agencia;
}
}*/

