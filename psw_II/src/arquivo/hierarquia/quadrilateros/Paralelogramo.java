package arquivo.hierarquia.quadrilateros;

import java.io.Serializable;

public class Paralelogramo extends Quadrilatero implements Serializable {
	protected String ladosOpostosParalelos;

	public Paralelogramo(double base, double altura, String ladosOpostosParalelos) {
		super(base, altura);
		this.ladosOpostosParalelos = ladosOpostosParalelos;
	}
	
	public String toString() {
		return "Paralelogramo [ladosOpostosParalelos=" + ladosOpostosParalelos + ", base=" + base + ", altura=" + altura
				+ "]";
	}
}