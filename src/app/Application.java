package app;

import figure.Cercle;
import figure.Dessin;
import figure.Figure;
import figure.Point;
import figure.Rectangle;
import observable.DefaultSettings;
import observable.Observable;
import strategy.Traiter1;
import strategy.Traiter2;

public class Application {
	public static void main(String[] args) {
		Observable settings=new DefaultSettings();
		Dessin dessin=new Dessin();
		Figure cercle=new Cercle(new Point(0,0),2);
		Figure rectangle=new Rectangle(new Point(1,1),5,2);
		settings.add(cercle);
		settings.add(rectangle);
		
		dessin.add(cercle);
		dessin.add(rectangle);
		
		cercle.dessiner();
		rectangle.dessiner();
		
		dessin.setTraiterStrategy(new Traiter1());
		dessin.traiterDessin();
		dessin.setTraiterStrategy(new Traiter2());
		dessin.traiterDessin();
		
		System.out.println("contour : "+((DefaultSettings)settings).getCouleurContour());
		System.out.println("remplissage : "+((DefaultSettings)settings).getCouleurRemplissage());
		((DefaultSettings)settings).setCouleurContour("grey");
		((DefaultSettings)settings).setCouleurRemplissage("violet");
		System.out.println("contour : "+((DefaultSettings)settings).getCouleurContour());
		System.out.println("remplissage : "+((DefaultSettings)settings).getCouleurRemplissage());
		
		try {
			dessin.export();			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
