package arquivo.hierarquia.animais;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArqTexto {
	Scanner scanner;
	
	public void openFile() {
			try {
				scanner = new Scanner( new File("d:\\Animal.txt") );
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
		Animal animal = new Animal();
		
		System.out.printf("Animal:\n\n");
		
		while (scanner.hasNext()) { // Laço é encerrado ao ler EOF (fim do arquivo)
			animal.setNome(scanner.next());
			animal.setComprimento(scanner.nextFloat());	
			animal.setPatas(scanner.nextInt());		
			animal.setCor(scanner.next());		
			animal.setAmbiente(scanner.next());
			animal.setVelocidade(scanner.nextFloat());		
			System.out.println(animal);
		}
	}
}