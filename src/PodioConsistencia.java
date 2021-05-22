import java.util.ArrayList;

public class PodioConsistencia extends Podio{

	@Override
	public Concursante[] obtenerGanadores(ArrayList<Concursante> concursantes) {
		// TODO Auto-generated method stub
		
		// si tiene un tiro descalificado, o sea puntaje 0, no entra al podio
		Concursante[] ganadores = new Concursante[3];
		return ganadores;
	}
	
	
}
