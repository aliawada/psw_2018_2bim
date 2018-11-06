package arquivo.hierarquia.quadrilateros;

public class TesteCriarArqTexto {

	public static void main(String[] args) {
		CriarArqTexto arq = new CriarArqTexto();
		
		arq.openFile();
		arq.adicionaRegistros();
		arq.closeFile();
	}

}