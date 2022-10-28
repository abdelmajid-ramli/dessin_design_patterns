package strategy;

import java.io.Serializable;

public class Traiter1 implements TraiterStrategy,Serializable{

	private static final long serialVersionUID = 1L;

	@Override
	public void traiter() {
		System.out.println("traitement 1 effectue");
	}

}
