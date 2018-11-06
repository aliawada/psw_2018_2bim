package arquivo.hierarquia.quadrilateros;

public class Quadrilatero {
	protected double base;
	protected double altura;
	
	public Quadrilatero(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public Quadrilatero() {
		base = 0;
		altura = 0;
	}
	
	public String toString() {
		return " Quadrilatero [base=" + base + ", altura=" + altura + "]";
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularArea() {
		double area = base * altura;
		return area;
	}
	
}