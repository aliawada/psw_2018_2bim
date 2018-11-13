package arquivo.retangulo;

public class TesteCriarArq {

	public static void main(String[] args) {
		CriarArqTexto arq = new CriarArqTexto();
		
		arq.openFile();
		arq.adicionaRegistros();
		arq.closeFile();
	}

}