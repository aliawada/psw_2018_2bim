package arquivo.ponto2d;

public class CriarArquivo {

	public static void main(String[] args) {
		CriarArqTexto arq = new CriarArqTexto();
		
		arq.openFile();
		arq.adicionaRegistros();
		arq.closeFile();
	}

}