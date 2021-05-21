import java.util.HashMap;

public class Concursante {
    private static int idConcursante = 0;
    static HashMap<Integer, Lanzamiento> lanzamientos = new HashMap<Integer,Lanzamiento>();

    public Concursante(){
        idConcursante++;
    }

    public static void efectuarLanzamiento(double distancia, double angulo, int nroLanzamiento){
        lanzamientos.put(nroLanzamiento,new Lanzamiento(distancia,angulo));

    }
}
