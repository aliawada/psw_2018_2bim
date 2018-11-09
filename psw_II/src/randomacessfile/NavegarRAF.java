package randomacessfile;

import java.io.*;

public class NavegarRAF {
	private static RandomAccessFile arquivo;

	public static void main(String args[]) {

	/* 
	 * Neste caso, usamos "rw" como parametro, pois além de lermos o arquivo
	 * faremos subsituicoes nele.
	 */

	try {
		arquivo = new RandomAccessFile(new File("arquivoRandomAccess.txt"),"rw");
	} catch (FileNotFoundException e) {
		System.out.println("Arquivo Inexistente");
		System.exit(0);
	}

	try {
		System.out.println(arquivo.readInt());
		System.out.println(arquivo.readDouble());
		System.out.println(arquivo.readChar());
		
		arquivo.seek(0);
		System.out.println(arquivo.readInt());
		
		arquivo.seek(12);
		System.out.println(arquivo.readChar());
	} catch (IOException e) {
		System.out.println("Erro lendo do arquivo");
		System.exit(0);
	}

/*
 * NAVEGACAO + GRAVACAO 
 */

	try {
		arquivo.seek(12);
		
		arquivo.writeChar('X');

		arquivo.seek(12);
		System.out.println(arquivo.readChar());
		} catch (IOException e) {
		System.out.println("Erro lendo do arquivo");
		System.exit(0);
		}

	System.exit(0);
	}
}
