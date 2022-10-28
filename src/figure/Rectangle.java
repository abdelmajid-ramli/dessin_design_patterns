package figure;

import java.io.Serializable;

public class Rectangle extends Figure implements Serializable{
	private Point coin;
	private double l;
	private double h;
	
	public Rectangle(Point coin, double l, double h) {
		super();
		this.coin = coin;
		this.l = l;
		this.h = h;
	}

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
