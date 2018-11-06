package arquivo.restaurantehipotetico;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class CriarArqTexto {
	private FileWriter objEscrita;
	private Scanner sc;
	
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
		sc = new Scanner(System.in);
		int x = 0;
		BufferedWriter buffer;
		
		System.out.println("Informe os dados do Restaurante (TotalMesas,PrecoBebida,PrecoPrato):");
		while (sc.hasNext()) { // Laço é encerrado ao ler EOF (fim do arquivo)
			restaurante.setTotalMesas(sc.nextInt());
			restaurante.setPrecoBebida(sc.nextFloat());
			restaurante.setPrecoPrato(sc.nextFloat());
			
			try {
			int vetor[] = new int[restaurante.getTotalMesas()]; 
			buffer = new BufferedWriter(new FileWriter("d:\\RestauranteHipoteticoQtd.txt"));
			
			System.out.println("Informe a QtdPratos em cada mesa do restaurante("+restaurante.getTotalMesas()+")");		
			for(int i=0;i<restaurante.getTotalMesas();i++) {
				vetor[i] = sc.nextInt();
				if(vetor[i] > 0) {
					x++;
					restaurante.setMesasOcupadas(x);
				}					
					buffer.write(vetor[i] + " ");
			}
			
			objEscrita.append( String.format("%d %.2f %.2f %d\n", restaurante.getTotalMesas(), restaurante.getPrecoBebida(),
					restaurante.getPrecoPrato(), restaurante.getMesasOcupadas()
					) );
			
			restaurante.setQtdPratos(vetor);
			buffer.newLine();
			System.out.println("Informe a QtdBebidas em cada mesa do restaurante("+restaurante.getTotalMesas()+")");
			for(int i = 0;i<restaurante.getTotalMesas();i++) {
				vetor[i] = sc.nextInt();
				buffer.write(vetor[i] + " ");
				}	
			restaurante.setQtdBebidas(vetor);
			buffer.close();
			}catch (IOException e1) {
					e1.printStackTrace();
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