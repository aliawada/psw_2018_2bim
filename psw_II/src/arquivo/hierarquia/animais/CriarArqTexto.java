package arquivo.hierarquia.animais;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CriarArqTexto {
	private FileWriter objEscrita;
	
	public void openFile() {
		try {
			objEscrita = new FileWriter("d:\\Animal.txt");
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void adicionaRegistros() {
		Animal animal = new Animal();
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf( 
		         "Para terminar, digite <ctrl> d no UNIX/Linux/Mac OS X\n" +
		         "ou <ctrl> z no Windows.\n\n" );
		
		System.out.println("Informe os dados do Animal "
				+ "(Nome,Comprimento,Patas,Cor,Ambiente,Velocidade):");
		
		while (scanner.hasNext()) { // Laço é encerrado ao ler EOF (fim do arquivo)
			animal.setNome(scanner.next());
			animal.setComprimento(scanner.nextFloat());	
			animal.setPatas(scanner.nextInt());		
			animal.setCor(scanner.next());		
			animal.setAmbiente(scanner.next());
			animal.setVelocidade(scanner.nextFloat());	
				try {
					objEscrita.append(
							String.format("%s %.2f %d %s %s %.2f\n",
									animal.getNome(),
									animal.getComprimento(),
									animal.getPatas(),
									animal.getCor(),
									animal.getAmbiente(),
									animal.getVelocidade()
									)
							);
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