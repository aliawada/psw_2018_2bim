package arquivo.hierarquia.quadrilateros;

public class Quadrado extends Paralelogramo{
	private String quatroAngulosCongruentes;
	private String quatroLadosCongruentes;
	
	public Quadrado(double base, double altura, String ladosOpostosParalelos, String quatroAngulosCongruentes,
			String quatroLadosCongruentes) {
		super(base, altura, ladosOpostosParalelos);
		this.quatroAngulosCongruentes = quatroAngulosCongruentes;
		this.quatroLadosCongruentes = quatroLadosCongruentes;
	}

	public String toString() {
		return "Quadrado [quatroAngulosCongruentes=" + quatroAngulosCongruentes + ", quatroLadosCongruentes="
				+ quatroLadosCongruentes + ", ladosOpostosParalelos=" + ladosOpostosParalelos + ", base=" + base
				+ ", altura=" + altura + "]";
	}	

}