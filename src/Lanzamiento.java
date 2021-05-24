
public class Lanzamiento {
	private double distancia;
	private double angulo;
	private double puntaje;

	public Lanzamiento(double distancia, double angulo) {
		this.distancia = distancia;
		this.angulo = angulo;
		this.puntaje = contabilizarPuntaje();
	}

	public double contabilizarPuntaje() {

		if (Math.abs(this.angulo) > 90) {
			return 0; // descalificado
		}

		if (Math.abs(this.angulo) > 30) {
			return this.distancia * 0.8;
		}

		return this.distancia;
	}

	public double getPuntaje() {
		return puntaje;
	}

}
