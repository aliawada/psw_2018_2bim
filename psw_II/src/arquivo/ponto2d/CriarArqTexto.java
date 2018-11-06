package arquivo.ponto2d;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CriarArqTexto {
	private FileWriter objEscrita;
	
	public void openFile() {
		try {
			objEscrita = new FileWriter("d:\\Ponto2D.txt");
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void adicionaRegistros() {
		Ponto2D ponto = new Ponto2D();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados dos Ponto2D "
				+ "(X,Y):");
		
		while (sc.hasNext()) { // Laço é encerrado ao ler EOF (fim do arquivo)
			ponto.setX(sc.nextFloat());
			ponto.setY(sc.nextFloat());
			
				try {
					objEscrita.append( String.format("%.2f %.2f\n", ponto.getX(), ponto.getY() ) );
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