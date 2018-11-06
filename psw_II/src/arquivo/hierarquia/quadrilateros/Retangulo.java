package arquivo.hierarquia.quadrilateros;

import java.io.Serializable;

public class Retangulo extends Paralelogramo implements Serializable{
	private String anglosCongruentes;

	public Retangulo(double base, double altura, String ladosOpostosParalelos, String anglosCongruentes) {
		super(base, altura, ladosOpostosParalelos);
		this.anglosCongruentes = anglosCongruentes;
	}

	public String toString() {
		return " Retangulo [anglosCongruentes=" + anglosCongruentes + ", ladosOpostosParalelos=" + ladosOpostosParalelos
				+ ", base=" + base + ", altura=" + altura + "]";
	}

}