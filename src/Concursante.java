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
	
	private double obtenerDiferenciaAngulos() {
    	double diferencia = 0;
    	double promedio = 0;
    	
    	for (Map.Entry<Integer, Lanzamiento> entry : lanzamientos.entrySet()) {

    	    promedio += entry.getValue().getAngulo();
    	}
    	
    	promedio = promedio/lanzamientos.size();
    	
    	for (Map.Entry<Integer, Lanzamiento> entry : lanzamientos.entrySet()) {

    	    diferencia += Math.abs(entry.getValue().getAngulo() - promedio);
    	}
    	
    	return diferencia;
	}
	
	private double obtenerDiferenciaDistancias() {
		double diferencia = 0;
    	double promedio = 0;
    	
    	for (Map.Entry<Integer, Lanzamiento> entry : lanzamientos.entrySet()) {

    	    promedio += entry.getValue().getDistancia();
    	}
    	
    	promedio = promedio/lanzamientos.size();
    	
    	for (Map.Entry<Integer, Lanzamiento> entry : lanzamientos.entrySet()) {

    	    diferencia += Math.abs(entry.getValue().getDistancia() - promedio);
    	}
    	
    	return diferencia;
	}
	
	public double diferenciaTotal() {
		return obtenerDiferenciaDistancias() + obtenerDiferenciaAngulos();
	}
	
}
