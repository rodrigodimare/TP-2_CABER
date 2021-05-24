import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Torneo {

	private int cantidadParticipantes;
	private ArrayList<Concursante> concursantes;

	// inicializacion de torneo
	// agregar cantidad de participantes
	public Torneo() {
		concursantes = new ArrayList<Concursante>();
	}

	public void cargarConcursantes() throws FileNotFoundException {

		Scanner entrada = new Scanner(new File("archivo.in"));

		if (entrada.hasNext())
			this.cantidadParticipantes = entrada.nextInt();

		double distancia;
		double angulo;
		int j = 0;

		while (entrada.hasNext()) {
			concursantes.add(new Concursante(j+1));
			for (int i = 0; i < 3 && entrada.hasNext(); i++) {
				distancia = Double.parseDouble(entrada.next());
				angulo = Double.parseDouble(entrada.next());
				concursantes.get(j).efectuarLanzamiento(distancia, angulo, i + 1);
			}
			j++;
		}
		entrada.close();
	}

	// para prueba (o no?)
	public ArrayList<Concursante> getConcursantes() {
		return concursantes;
	}

}