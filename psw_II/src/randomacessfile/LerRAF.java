package randomacessfile;

import java.io.*;

public class LerRAF {
	private static RandomAccessFile arquivo;

	public static void main(String args[]) {

	/* 
	 * Neste caso, usamos apenas "r" como parametro, pois apenas iremos ler
	 * este arquivo.
	 */
		
	try {
		arquivo = new RandomAccessFile(new File("arquivoRandomAccess.txt"),"r");
	} catch (FileNotFoundException e) {
		System.out.println("Arquivo Inexistente");
		System.exit(0);
	}

	try {
		System.out.println(arquivo.readInt());
		System.out.println(arquivo.readDouble());
		System.out.println(arquivo.readChar());
	} catch (IOException e) {
		System.out.println("Erro lendo do arquivo");
		System.exit(0);
	}

	System.exit(0);
	}
}
