package arquivo.hierarquia.quadrilateros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CriarArqTexto {
	private FileWriter objEscrita;
	
	public void openFile() {
		try {
			objEscrita = new FileWriter("d:\\HierarquiaQuadrilateros.txt");
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void adicionaRegistros() {
		Quadrilatero quadrilatero = new Quadrilatero();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados do Quadrilatero(base, altura):");
		
		while (sc.hasNext()) { // Laço é encerrado ao ler EOF (fim do arquivo)
			quadrilatero.setBase(sc.nextDouble());
			quadrilatero.setAltura(sc.nextDouble());
				try {
					objEscrita.append( String.format("%02f %02f\n", quadrilatero.getBase(),quadrilatero.getAltura()) );
				} catch (IOException e) {
					e.printStackTrace();
					System.exit(0);
				}
			}
		sc.close();
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