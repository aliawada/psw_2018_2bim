package arquivo.retangulo;

import arquivos.*;

public class Principal {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo(4.5F,2F);
		
		ManipuladorArquivo.escritor("arquivoRetangulo.txt", retangulo.toString());
		ManipuladorArquivo.leitor("arquivoRetangulo.txt");
		
		Serialize.serialize(retangulo);
		Deserialize.deserialize(retangulo);
	}

}
