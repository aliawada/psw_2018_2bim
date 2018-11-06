package arquivo.hierarquia.animais;

public class LerArqTextoAnimal {
	public static void main(String[] args) {
		LerArqTexto lerarq = new LerArqTexto();
		lerarq.openFile();
		lerarq.lerArquivo();
		lerarq.closeFile();
	}
}