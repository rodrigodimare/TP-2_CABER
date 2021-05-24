import java.util.HashMap;
import java.util.Map;



public class Concursante {
	
    private int idConcursante;
    //static HashMap<Integer, Lanzamiento> lanzamientos = new HashMap<Integer,Lanzamiento>();
    private HashMap<Integer, Lanzamiento> lanzamientos;
    
    

    public Concursante(int id){
       this.idConcursante = id;
        lanzamientos = new HashMap<Integer,Lanzamiento>(); // se inicializa el hashmap
    }

    //public static void efectuarLanzamiento(double distancia, double angulo, int nroLanzamiento){
    public void efectuarLanzamiento(double distancia, double angulo, int nroLanzamiento){
        lanzamientos.put(nroLanzamiento, new Lanzamiento(distancia,angulo));

    }

	public HashMap<Integer, Lanzamiento> getLanzamientos() {
		return lanzamientos;
	}
	
	
	
    
    public int getIdConcursante() {
		return idConcursante;
	}

	public double puntajeTotal() {
    	double total = 0;
    	
    	for (Map.Entry<Integer, Lanzamiento> entry : lanzamientos.entrySet()) {

    	    total += entry.getValue().getPuntaje();
    	}
    	
    	
    	return total;
    }
	
}
