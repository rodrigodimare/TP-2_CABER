import java.io.FileNotFoundException;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Torneo torneo = new Torneo();
		torneo.cargarConcursantes();

        PodioDistancia pd = new PodioDistancia();
        
        Concursante[] x = pd.obtenerGanadores(torneo.getConcursantes());
        
        for(int j = 0; j<3; j++) {
        	System.out.print(x[j].getIdConcursante() + " ");
        }
        

	}

}
