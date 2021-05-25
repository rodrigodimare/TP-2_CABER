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
    	double puntaje = 0;
    	
    	for (Map.Entry<Integer, Lanzamiento> entry : lanzamientos.entrySet()) {

    	    puntaje += entry.getValue().getPuntaje();
    	}
    	return puntaje;
    }
	
	public boolean algunLanzamientoDescalificado() {
		
		for (Map.Entry<Integer, Lanzamiento> entry : lanzamientos.entrySet()) {
    	    if(entry.getValue().getDescalificado())
    	    	return true;
    	}
		return false;
	}
	
	public double diferenciaTotal() {
		
		double diferenciaAngulo = 0;
		double diferenciaDistancia = 0;
		double promedioAngulo = 0;
		double promedioDistancia = 0;
		
		for (Map.Entry<Integer, Lanzamiento> entry : lanzamientos.entrySet()) {

    	    promedioAngulo += entry.getValue().getAngulo();
    	    promedioDistancia += entry.getValue().getDistancia();
    	}
    	
    	promedioAngulo = promedioAngulo/lanzamientos.size();
    	promedioDistancia = promedioDistancia/lanzamientos.size();
    	
    	for (Map.Entry<Integer, Lanzamiento> entry : lanzamientos.entrySet()) {

    	    diferenciaAngulo += Math.abs(entry.getValue().getAngulo() - promedioAngulo);
    	    diferenciaDistancia += Math.abs(entry.getValue().getDistancia() - promedioDistancia);
    	}
    	
    	return diferenciaAngulo + diferenciaDistancia;
		
	}

}
