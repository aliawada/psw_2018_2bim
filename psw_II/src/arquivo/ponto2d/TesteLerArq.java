package arquivo.ponto2d;

public class TesteLerArq {

	public static void main(String[] args) {
		LerArqTexto arq = new LerArqTexto();
		
		arq.openFile();
		arq.lerArquivo();
		arq.closeFile();
	}

}