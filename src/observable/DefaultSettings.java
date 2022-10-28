package observable;

import java.util.ArrayList;
import java.util.List;

public class DefaultSettings implements Observable{
	
	public double epaisseurContour=1;
	public String couleurContour="black";
	public String couleurRemplissage="bleu";
	
	List<Observer> observers=new ArrayList<>();	
	
	@Override
	public void add(Observer observer) {
		this.observers.add(observer);
		observer.update(this);
	}

	@Override
	public void remove(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: observers) {
			observer.update(this);
		}
	}

	public double getEpaisseurContour() {
		return epaisseurContour;
	}

	public void setEpaisseurContour(double epaisseurContour) {
		this.epaisseurContour = epaisseurContour;
	}

	public String getCouleurContour() {
		return couleurContour;
	}

	public void setCouleurContour(String couleurContour) {
		this.couleurContour = couleurContour;
	}

	public String getCouleurRemplissage() {
		return couleurRemplissage;
	}

	public void setCouleurRemplissage(String couleurRemplissage) {
		this.couleurRemplissage = couleurRemplissage;
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}
	
	
}
