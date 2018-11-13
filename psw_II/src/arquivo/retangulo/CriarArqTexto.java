package arquivo.retangulo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CriarArqTexto {
	private FileWriter objEscrita;
	
	public void openFile() {
		try {
			objEscrita = new FileWriter("d:\\Retangulo.txt");
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void adicionaRegistros() {
		Retangulo retangulo = new Retangulo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados do Retangulo "
				+ "(comprimento,largura):");
		
		while (sc.hasNext()) { // Laço é encerrado ao ler EOF (fim do arquivo)
			retangulo.setComprimento(sc.nextFloat());
			retangulo.setLargura(sc.nextFloat());
			
				try {
					objEscrita.append( String.format("%.2f %.2f %.2f %.2f\n", retangulo.getComprimento(), retangulo.getLargura(),retangulo.calcularArea(),retangulo.calcularPerimetro() ) );
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