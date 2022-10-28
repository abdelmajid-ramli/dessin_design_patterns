package figure;

import observable.Observable;

public class Rectangle extends Figure{
	private Point coin;
	private double l;
	private double h;

	@Override
	public double perimetre() {
		return 2*(l+h);
	}

	@Override
	public double surface() {
		return l*h;
	}

	@Override
	public void dessiner() {
		System.out.println("rectangle : coin : "+coin.toString()+" l : "+l+" h : "+h);
	}

}
