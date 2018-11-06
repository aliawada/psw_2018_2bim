package arquivo.ponto2d;

import java.io.Serializable;

public class Poligono implements Serializable{
	private int lados;
	
	public Poligono(int lados) {
		this.lados = dezLados(lados);
	}
	
	public int dezLados(int lados) {
		if(lados > 10 || lados < 3)
			lados = 3;
			return lados;
	}

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}
	
	public String toString() {
		return "Poligono [lados=" + lados + "]";
	}

	public String mostraNomePoligono() {
		if(lados == 3)
			return "Trilátero";
		else if(lados == 4)
			return "Quadrilátero";
		else if(lados == 5)
			return "Pentalátero";
		else if(lados == 6)
			return "Hexalátero";
		else if(lados == 7)
			return "Heptalátero";
		else if(lados == 8)
			return "Octolátero";
		else if(lados == 9)
			return "Undecalátero";
		else if(lados == 10);
			return "Decalátero";
	}
	
}