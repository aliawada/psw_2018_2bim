package arquivo.hierarquia.quadrilateros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArqTexto {
	Scanner scanner;
	
	public void openFile() {
			try {
				scanner = new Scanner( new File("d:\\HierarquiaQuadrilateros.txt") );
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.exit(0);
			}
	}
	
	public void closeFile() {
		if(scanner != null) {
			scanner.close();
			scanner = null;
		}
	}
	
	public void lerArquivo() {
		Quadrilatero quadrilatero = new Quadrilatero();
		System.out.printf("Quadrilatero:\n\n");
		
		while (scanner.hasNext()) { // Laço é encerrado ao ler EOF (fim do arquivo)
			quadrilatero.setBase(scanner.nextDouble());
			quadrilatero.setAltura(scanner.nextDouble());
			
			System.out.println(quadrilatero);
		}
	}
}