package arquivo.restaurantehipotetico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArqTexto {
	Scanner scanner;
	
	public void openFile() {
			try {
				scanner = new Scanner( new File("d:\\RestauranteHipotetico.txt") );
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
		RestauranteHipotetico restaurante = new RestauranteHipotetico();
		
		System.out.printf("Restaurante Hipotetico:\n\n");
		
		while (scanner.hasNext()) { // Laço é encerrado ao ler EOF (fim do arquivo)
			restaurante.setTotalMesas(scanner.nextInt());
			restaurante.setPrecoBebida(scanner.nextFloat());
			restaurante.setPrecoPrato(scanner.nextFloat());
			
			System.out.println(restaurante);
		}
	}
}