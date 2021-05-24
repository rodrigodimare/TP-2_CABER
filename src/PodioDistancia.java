import java.io.FileWriter;
import java.io.PrintWriter;
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
		generarArchivoGanadores(ganadores);
		return ganadores;
	}
	
	public void generarArchivoGanadores(Concursante[] ganadores) {
		
		FileWriter fichero = null;
		PrintWriter pw = null;

		try {
			fichero = new FileWriter("archivo.out");
			pw = new PrintWriter(fichero);

            for(int i=0;i<3;i++) {
            	pw.print(ganadores[i].getIdConcursante() + " ");
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

}
