public class Lanzamiento {
    private double distancia;
    private double angulo;
    private double puntaje;

    public Lanzamiento(double distancia, double angulo){
        this.distancia = distancia;
        this.angulo = angulo;
        contabilizarPuntaje();
    }

    public void contabilizarPuntaje(){
        //logica del puntaje
    }
}
