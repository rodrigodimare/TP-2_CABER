
import java.io.FileNotFoundException;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Torneo torneo = new Torneo();
		torneo.cargarConcursantes("archivo.in");
        torneo.generarArchivoGanadores();
	}

}
