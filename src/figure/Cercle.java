package figure;

import observable.Observable;

public class Cercle extends Figure{
	private Point centre;
	private double rayon;

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
