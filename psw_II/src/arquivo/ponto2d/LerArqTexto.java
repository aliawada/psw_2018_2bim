package arquivo.ponto2d;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArqTexto {
	Scanner scanner;
	
	public void openFile() {
			try {
				scanner = new Scanner( new File("d:\\Ponto2D.txt") );
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
		Ponto2D ponto = new Ponto2D();	
		
		System.out.printf("Ponto2D:\n\n");
		
		while (scanner.hasNext()) { // Laço é encerrado ao ler EOF (fim do arquivo)
			ponto.setX(scanner.nextFloat());
			ponto.setY(scanner.nextFloat());
			System.out.println(ponto);
		}
	}
}