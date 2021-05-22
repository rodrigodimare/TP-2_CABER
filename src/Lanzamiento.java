
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
    
			if (Math.abs(this.angulo) > 90) {
				
				this.puntaje = 0; // descalificado
			
			} else if (Math.abs(this.angulo) > 30) {
				
				this.puntaje = this.distancia * 0.8;

			} else {
				
				this.puntaje = this.distancia;
				
			}
	}

	public double getPuntaje() {
		return puntaje;
	}
    
    
    
}
