package figure;

import java.io.Serializable;

public class Cercle extends Figure implements Serializable{
	private Point centre;
	private double rayon;
	
	public Cercle(Point centre,double rayon) {
		this.centre=centre;
		this.rayon=rayon;
	}

	@Override
	public double perimetre() {
		return 2*Math.PI*rayon;
	}

	@Override
	public double surface() {
		return Math.PI*rayon*rayon;
	}

	@Override
	public void dessiner() {
		System.out.println("cercle : centre : "+centre.toString()+" rayon : "+rayon);
	}

}
