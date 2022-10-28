package figure;

import java.io.Serializable;

import observable.DefaultSettings;
import observable.Observable;
import observable.Observer;

public abstract class Figure implements Observer,Serializable{
	private static final long serialVersionUID = 1L;
	public double epaisseurContour;
	public String couleurContour;
	public String couleurRemplissage;
	
	@Override
	public void update(Observable observable) {
		this.epaisseurContour=((DefaultSettings)observable).getEpaisseurContour();
		this.couleurContour=((DefaultSettings)observable).getCouleurContour();
		this.couleurRemplissage=((DefaultSettings)observable).getCouleurRemplissage();
	}
	
	public abstract double perimetre();
	public abstract double surface();
	public abstract void dessiner();

}
