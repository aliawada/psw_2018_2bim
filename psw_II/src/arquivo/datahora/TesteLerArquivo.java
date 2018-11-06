package arquivo.datahora;

public class TesteLerArquivo {

	public static void main(String[] args) {
		LerArqTexto arq = new LerArqTexto();
		
		arq.openFile();
		arq.lerArquivo();
		arq.closeFile();
	}

}