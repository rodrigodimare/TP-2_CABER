import java.util.HashMap;

public class Concursante {
	
    private static int idConcursante = 0;
    //static HashMap<Integer, Lanzamiento> lanzamientos = new HashMap<Integer,Lanzamiento>();
    private HashMap<Integer, Lanzamiento> lanzamientos;
    
    

    public Concursante(){
        idConcursante++;
        lanzamientos = new HashMap<Integer,Lanzamiento>(); // se inicializa el hashmap
    }

    //public static void efectuarLanzamiento(double distancia, double angulo, int nroLanzamiento){
    public void efectuarLanzamiento(double distancia, double angulo, int nroLanzamiento){
        lanzamientos.put(nroLanzamiento, new Lanzamiento(distancia,angulo));

    }

	public HashMap<Integer, Lanzamiento> getLanzamientos() {
		return lanzamientos;
	}
    
    
}
