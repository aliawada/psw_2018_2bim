package arquivo.restaurantehipotetico;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class CriarArqTexto {
	private FileWriter objEscrita;
	
	public void openFile() {
		try {
			objEscrita = new FileWriter("d:\\RestauranteHipotetico.txt");
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void adicionaRegistros() {
		RestauranteHipotetico restaurante = new RestauranteHipotetico();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados dos Restaurantes "
				+ "(TotalMesas,PrecoBebida,PrecoPrato):");
		
		while (sc.hasNext()) { // Laço é encerrado ao ler EOF (fim do arquivo)
			restaurante.setTotalMesas(sc.nextInt());
			restaurante.setPrecoBebida(sc.nextFloat());
			restaurante.setPrecoPrato(sc.nextFloat());
			
			System.out.println("Informe a QtdPratos em cada mesa do restaurante("+restaurante.getTotalMesas()+")");
			int vetor[] = new int[restaurante.getTotalMesas()]; 
			for(int i=0;i<restaurante.getTotalMesas();i++) {
				int x = 0;
				vetor[i] = sc.nextInt();
				if(vetor[i] > 0) {
					x++;
					restaurante.setMesasOcupadas(x);
				}
			}
			restaurante.setQtdPratos(vetor);
			
			System.out.println("Informe a QtdBebidas em cada mesa do restaurante("+restaurante.getTotalMesas()+")");
			for(int i = 0;i<restaurante.getTotalMesas();i++) {
				vetor[i] = sc.nextInt();
			}
			restaurante.setQtdBebidas(vetor);
				try {
					objEscrita.append( String.format("%d %.2f %.2f %.2f %s %s\n", restaurante.getTotalMesas(), restaurante.getPrecoBebida(),
							restaurante.getPrecoPrato(), restaurante.getTotalVendas(), Arrays.toString(restaurante.getQtdPratos()), Arrays.toString(restaurante.getQtdBebidas())) );
				} catch (IOException e) {
					e.printStackTrace();
					System.exit(0);
				}
			}
		}
	
	public void closeFile() {
		if(objEscrita != null) {
			try {
				objEscrita.close();
				objEscrita = null;
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
	}

}