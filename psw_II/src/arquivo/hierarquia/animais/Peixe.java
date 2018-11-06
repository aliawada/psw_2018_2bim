package arquivo.hierarquia.animais;

import java.io.Serializable;

public class Peixe extends Animal implements Serializable {
	private String caracteristica;

	public Peixe(String nome, float comprimento, int patas, String cor, String ambiente, float velocidade,
			String caracteristica) {
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.caracteristica = caracteristica;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	public void dadosPeixe() {
		System.out.println("\nNome: " + this.nome + "\nComprimento: " + this.comprimento + "\nPatas: " + this.patas + "\nCor: " + this.cor + "\nAmbiente: " + this.ambiente + "\nVelocidade: " + this.velocidade + "\nCaracterística: " + this.caracteristica);
	}

	@Override
	public String toString() {
		return "Peixe [caracteristica=" + caracteristica + ", nome=" + nome + ", comprimento=" + comprimento
				+ ", patas=" + patas + ", cor=" + cor + ", ambiente=" + ambiente + ", velocidade=" + velocidade + "]";
	}
	
}