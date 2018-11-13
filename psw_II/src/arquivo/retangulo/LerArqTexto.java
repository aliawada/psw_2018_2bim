package arquivo.retangulo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArqTexto {
	Scanner scanner;
	
	public void openFile() {
			try {
				scanner = new Scanner( new File("d:\\Retangulo.txt") );
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
		Retangulo retangulo = new Retangulo();
		float area,perim;
		System.out.printf("Ponto2D:\n\n");
		
		while (scanner.hasNext()) { // Laço é encerrado ao ler EOF (fim do arquivo)
			retangulo.setComprimento(scanner.nextFloat());
			retangulo.setLargura(scanner.nextFloat());
			area = scanner.nextFloat();
			perim = scanner.nextFloat();
			System.out.println(retangulo);
			System.out.println("Área = " + area + "\nPerimetro = " + perim);
		}
	}
}