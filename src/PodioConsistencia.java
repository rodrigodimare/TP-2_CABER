import java.util.ArrayList;

public class PodioConsistencia extends Podio{

	@Override
	public Concursante[] obtenerGanadores(ArrayList<Concursante> concursantes) {
		// TODO Auto-generated method stub
		
		// si tiene un tiro descalificado, o sea puntaje 0, no entra al podio
		Concursante[] ganadores = new Concursante[3];
		return ganadores;
	}
	
	/*
	1- 
		1.49 - 1.50 = 0.01
		1.49 - 1.51 = 0.02
		1.50 - 1.51 = 0.01
	
		5-3 = 2
		5--3 = 8
		3--3 = 6
	2- 
		2.10 - 2.00 = 0.1
		2.10 - 1.00 = 1.1
		2.00 - 1.00 = 1
		
		6--6 = 12
		6-2 = 4
		-6-2 = -8
	
	*/
	
}
