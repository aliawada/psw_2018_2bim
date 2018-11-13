package arquivo.retangulo;

import java.io.Serializable;

public class Retangulo implements Serializable{
	private float comprimento;
	private float largura;
	
	public Retangulo(float comprimento, float largura) {
		this.comprimento = comprimento;
		this.largura = largura;
	}
	
	public Retangulo() {
		comprimento = 0;
		largura = 0;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		if(comprimento <= 0 || comprimento >= 20)
			this.comprimento = 1;
		else this.comprimento = comprimento;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		if(largura <= 0 || largura >= 20)
			this.largura = 1;
		else this.largura = largura;
	}
	
	public float calcularPerimetro() {
		float perimetro = 2*(comprimento + largura);
		return perimetro;
	}
	
	public float calcularArea() {
		float area = comprimento * largura;
		return area;
	}

	public String toString() {
		return "Retangulo [comprimento=" + comprimento + ", largura=" + largura + "]";
	}
	
	
}