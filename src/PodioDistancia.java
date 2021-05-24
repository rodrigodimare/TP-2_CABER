import java.util.ArrayList;

public class PodioDistancia extends Podio {

	@Override
	public ArrayList<Concursante> obtenerGanadores(ArrayList<Concursante> concursantes) {

		ArrayList<Concursante> ganadores = new ArrayList<Concursante>();
		double puntajeConcursante;

		for (Concursante c : concursantes) {

			puntajeConcursante = c.puntajeTotal();

			int cant = ganadores.size();
			
			if(cant<3) {
				int i = 0;
				while(i<cant && ganadores.get(i).puntajeTotal()>puntajeConcursante) {
					i++;
				}
				ganadores.add(i,c);
			}
			
			else {
				int i = 0;
				while(i<3 && ganadores.get(i).puntajeTotal()>puntajeConcursante) {
					i++;
				}
				
				if(i<3) {
					ganadores.add(i,c);
					ganadores.remove(3);
				}
			}

		}
		
		return ganadores;
	}
	
}
