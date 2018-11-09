package randomacessfile;

import java.io.*;

public class EscreverRAF {
	private static RandomAccessFile arquivo;

	public static void main(String args[]) {
/* 
 * Neste caso, deve-se instanciar o objeto "RandomAccessFile" como "rw" para poder escrever
 * o conteudo desejado nele
 */

	try {
		arquivo = new RandomAccessFile(new File("arquivoRandomAccess.txt"),"rw");
	}
	catch (FileNotFoundException e) {
		System.out.println("Arquivo Inexistente");
		System.exit(0);
	}

	try {
		arquivo.writeInt(666);
		arquivo.writeDouble(12345.45);
		arquivo.writeChar('A');
	} catch (IOException e) {
	System.out.println("Erro escrevendo no arquivo");
	System.exit(0);
	}

	System.exit(0);
 }
}
