package arquivo.hierarquia.animais;

import java.io.Serializable;

public class Mamifero extends Animal implements Serializable {
	private String alimento;

	public Mamifero(String nome, float comprimento, int patas, String cor, String ambiente, float velocidade,
			String alimento) {
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public void dadosMamifero() {
		System.out.println("\nNome: " + this.nome + "\nComprimento: " + this.comprimento + "\nPatas: " + this.patas + "\nCor: " + this.cor + "\nAmbiente: " + this.ambiente + "\nVelocidade: " + this.velocidade + "\nAlimento: " + this.alimento);
	}

	@Override
	public String toString() {
		return "Mamifero [alimento=" + alimento + ", nome=" + nome + ", comprimento=" + comprimento + ", patas=" + patas
				+ ", cor=" + cor + ", ambiente=" + ambiente + ", velocidade=" + velocidade + "]";
	}
	
}