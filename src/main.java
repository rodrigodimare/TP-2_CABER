import java.io.*;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        final int TIROS = 3;
        int i = 0;
        int cantidadParticipantes = 0;
        double distancia = 0;
        double angulo = 0;
        try {
            File archivo = new File("Archivo.in");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String lineaArchivo;
            if ((lineaArchivo = br.readLine()) != null) {
                cantidadParticipantes = Integer.parseInt(lineaArchivo);
                //System.out.println(cantidadParticipantes);
            }
            Torneo torneoCaber = new Torneo();
            torneoCaber.cargarCantidadParticipantes(cantidadParticipantes);
            while (i < cantidadParticipantes) {
                torneoCaber.cargarConcursantes(new Concursante());
                for (int j = 0; j < TIROS; j++) {
                    lineaArchivo = br.readLine();
                    if (lineaArchivo != null) {
                        String arrayTiros[] = lineaArchivo.split("   ");
                        distancia = Double.parseDouble(arrayTiros[0]);
                        angulo = Double.parseDouble(arrayTiros[1]);
                        //System.out.println("distancia: " + distancia + " angulo: " + angulo);
                        Concursante.efectuarLanzamiento(distancia,angulo,j+1);
                    }
                }
                i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
