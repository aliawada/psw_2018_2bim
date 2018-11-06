package arquivo.restaurantehipotetico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class LerArqTexto {
	Scanner scanner;
	Scanner scanner2;
	
	public void openFile() {
			try {
				scanner = new Scanner( new File("d:\\RestauranteHipotetico.txt") );
				scanner2 = new Scanner(new File("d:\\RestauranteHipoteticoQtd.txt"));
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
		if(scanner2 != null) {
			scanner2.close();
			scanner2 = null;
		}
	}
	
	public void lerArquivo() {
		RestauranteHipotetico restaurante = new RestauranteHipotetico();
		
		System.out.printf("Restaurante Hipotetico:\n\n");
		
		while (scanner.hasNext()) { // Laço é encerrado ao ler EOF (fim do arquivo)
			restaurante.setTotalMesas(scanner.nextInt());
			restaurante.setPrecoBebida(scanner.nextFloat());
			restaurante.setPrecoPrato(scanner.nextFloat());
			restaurante.setMesasOcupadas(scanner.nextInt());
		}
		
		int vetor1[] = new int[restaurante.getTotalMesas()];
		int vetor2[] = new int[restaurante.getTotalMesas()];
		while (scanner2.hasNext()) { 
			for(int i =0;i < restaurante.getTotalMesas();i++) {
				vetor1[i] = scanner2.nextInt(); 
			}
			restaurante.setQtdPratos(vetor1);
			
			scanner2.nextLine();
			for(int i =0;i < restaurante.getTotalMesas();i++) {
				vetor2[i] = scanner2.nextInt(); 
			}
			restaurante.setQtdBebidas(vetor2);
			}
		System.out.println(restaurante);
		}
	}