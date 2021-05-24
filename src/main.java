import java.io.*;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
    	
    	
        final int TIROS = 3;
        int i = 0;
        int cantidadParticipantes = 0;
        double distancia = 0;
        double angulo = 0;
        
        Torneo torneoCaber = new Torneo();
        
        try {
        	
            File archivo = new File("Archivo.in");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            
            String lineaArchivo;
            
            // lee participantes
            if ((lineaArchivo = br.readLine()) != null) {
                cantidadParticipantes = Integer.parseInt(lineaArchivo); 
                
                if(cantidadParticipantes<3 || cantidadParticipantes > 1000000) {
                	br.close();
                	System.out.println("Cantidad de participantes erroneo");
                	return;
                }
            }
            
            
            // inicializacion del torneo y carga de participantes
            // Torneo torneoCaber = new Torneo();
            torneoCaber.cargarCantidadParticipantes(cantidadParticipantes);
            
            
            
            while (i < cantidadParticipantes) {
            	
                //torneoCaber.cargarConcursantes(new Concursante());
                
            	Concursante concursante = new Concursante(i+1);
                for (int j = 0; j < TIROS; j++) {
                	lineaArchivo = br.readLine();
                    if (lineaArchivo != null) {
                        String arrayTiros[] = lineaArchivo.split("   ");
                        distancia = Double.parseDouble(arrayTiros[0]);
                        angulo = Double.parseDouble(arrayTiros[1]);
                        //System.out.println("distancia: " + distancia + " angulo: " + angulo);
                        //Concursante.efectuarLanzamiento(distancia,angulo,j+1);
                        concursante.efectuarLanzamiento(distancia,angulo,j+1);
                    }
                }
                
                torneoCaber.cargarConcursantes(concursante);
                
                i++;
            }
            
            br.close();
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
        
        
        PodioDistancia pd = new PodioDistancia();
        
        Concursante[] x = pd.obtenerGanadores(torneoCaber.getConcursantes());
        
        for(int j = 0; j<3; j++) {
        	System.out.print(x[j].getIdConcursante() + " ");
        }
        
        
        
        
        
        
        
        // prueba borrar
        // mostrar(torneoCaber.getConcursantes());
        
        
    }
    
    
    
}
