import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
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

	public void cargarConcursantes(String nombre_archivo) throws FileNotFoundException {

		Scanner entrada = new Scanner(new File(nombre_archivo));

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
	
	public void generarArchivoGanadores() {
		
		FileWriter fichero = null;
		PrintWriter pw = null;

		try {
			fichero = new FileWriter("archivo.out");
			pw = new PrintWriter(fichero);
			
			ArrayList<Concursante> ganadoresConsistencia = new PodioConsistencia().obtenerGanadores(concursantes);
			ArrayList<Concursante> ganadoresDistancia = new PodioDistancia().obtenerGanadores(concursantes);
			
            for(int i=0;i<ganadoresConsistencia.size();i++) {
            	pw.print(ganadoresConsistencia.get(i).getIdConcursante() + " ");
            }
            pw.println();
            for(int i=0;i<ganadoresDistancia.size();i++) {
            	pw.print(ganadoresDistancia.get(i).getIdConcursante() + " ");
            }
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fichero != null)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}


	// para prueba (o no?)
	public ArrayList<Concursante> getConcursantes() {
		return concursantes;
	}

}