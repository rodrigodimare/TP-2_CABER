import java.util.ArrayList;

public class PodioConsistencia extends Podio {

	@Override
	public ArrayList<Concursante> obtenerGanadores(ArrayList<Concursante> concursantes) {
		ArrayList<Concursante> ganadores = new ArrayList<Concursante>();
		double diferenciaConcursante;

		for (Concursante c : concursantes) {

			if (!c.algunLanzamientoDescalificado()) {

				diferenciaConcursante = c.diferenciaTotal();

				int cant = ganadores.size();

				if (cant < 3) {
					int i = 0;
					while (i < cant && ganadores.get(i).diferenciaTotal() < diferenciaConcursante) {
						i++;
					}
					ganadores.add(i, c);
				}

				else {
					int i = 0;
					while (i < 3 && ganadores.get(i).diferenciaTotal() < diferenciaConcursante) {
						i++;
					}

					if (i < 3) {
						ganadores.add(i, c);
						ganadores.remove(3);
					}
				}

			}
		}

		return ganadores;
	}

}
