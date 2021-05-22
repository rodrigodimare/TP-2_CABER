import java.util.ArrayList;

public class Torneo {
	
    private int cantidadParticipantes;
    private ArrayList<Concursante> concursantes;


    // inicializacion de torneo 
    // agregar cantidad de participantes
    public Torneo() {
    	concursantes = new ArrayList<Concursante>();
	}


    // borrar
	public void cargarCantidadParticipantes(int cantidadParticipantes) {
        this.cantidadParticipantes = cantidadParticipantes;
    }


	// ???
    // public void cargarCantidadParticipantes() {
    // }

    
    // carga de concursantes en el torneo
    public void cargarConcursantes(Concursante concursante) {
    	concursantes.add(concursante);
    }


    // para prueba (o no?)
	public ArrayList<Concursante> getConcursantes() {
		return concursantes;
	}

    
    
}