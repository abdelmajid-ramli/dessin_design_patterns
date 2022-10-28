package figure;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import strategy.TraiterStrategy;

public class Dessin extends Figure implements Serializable {
	private static final long serialVersionUID = 1L;
	private TraiterStrategy traiterStrategy;
	private List<Figure> figures = new ArrayList<>();

	public void setTraiterStrategy(TraiterStrategy traiterStrategy) {
		this.traiterStrategy = traiterStrategy;
	}

	public void traiterDessin() {
		traiterStrategy.traiter();
	}

	public List<Figure> getFigures() {
		return figures;
	}

	public void add(Figure figure) {
		figures.add(figure);
	}

	public void remove(Figure figure) {
		figures.remove(figure);
	}

	@Override
	public double perimetre() {
		double res = 0;
		for (Figure figure : figures) {
			res += figure.perimetre();
		}
		return res;
	}

	@Override
	public double surface() {
		double res = 0;
		for (Figure figure : figures) {
			res += figure.surface();
		}
		return res;
	}

	@Override
	public void dessiner() {
		int i = 1;
		for (Figure figure : figures) {
			System.out.println("element : " + i);
			figure.dessiner();
			i++;
		}

	}

	public void export() throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("dessin1.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(this);
		objectOutputStream.flush();
		objectOutputStream.close();
		System.out.println("dessin enregistrer");
	}

}
