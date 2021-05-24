import java.util.ArrayList;

public class PodioDistancia extends Podio{
	

	
	
	@Override
	public Concursante[] obtenerGanadores(ArrayList<Concursante> concursantes) {
		
		Concursante[] ganadores = new Concursante[3];
				
		for(Concursante c: concursantes) {
				
			if(ganadores[0]==null || ganadores[0].puntajeTotal()<c.puntajeTotal()) {
				
				if(ganadores[0]==null) {
					ganadores[0]=c;
				}else {
					ganadores[2]=ganadores[1];
					ganadores[1]=ganadores[0];
					ganadores[0]=c;
				}
				
			}else if(ganadores[1]==null || ganadores[1].puntajeTotal()<c.puntajeTotal()) {
				if(ganadores[1]==null) {
					ganadores[1]=c;
				}else {
					ganadores[2]=ganadores[1];
					ganadores[1]=c;
				}
				
			}else if(ganadores[2]==null || ganadores[2].puntajeTotal()<c.puntajeTotal()) {
				
				if(ganadores[2]==null) {
					ganadores[2]=c;
				}else {
					ganadores[2]=c;
				}
			}
		}
		return ganadores;
	}

}
