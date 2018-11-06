package arquivo.ponto2d;

import arquivos.*;

public class Principal {

	public static void main(String[] args) {
		Ponto2D ponto = new Ponto2D(3,2);
		Ponto2D ponto2 = new Ponto2D(4,5);
		Linha linha = new Linha(ponto,ponto2);
		
		Poligono poligono = new Poligono(8);
		
		ManipuladorArquivo.escritor("arquivoPonto2D.txt", ponto.toString());
		ManipuladorArquivo.escritor("arquivoPonto2D.txt", ponto2.toString());
		ManipuladorArquivo.escritor("arquivoPonto2D.txt", linha.toString());
		ManipuladorArquivo.leitor("arquivoPonto2D.txt");
		
		Serialize.serialize(poligono);
		Deserialize.deserialize(poligono);
		
		
	}

}