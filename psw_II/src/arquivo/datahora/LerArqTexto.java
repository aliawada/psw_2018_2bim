package arquivo.datahora;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArqTexto {
	Scanner scanner;
	
	public void openFile() {
			try {
				scanner = new Scanner( new File("d:\\DataHora.txt") );
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
		Hora hora = new Hora();
		Data data = new Data();
		
		
		System.out.printf("Data e Hora:\n\n");
		
		while (scanner.hasNext()) { // Laço é encerrado ao ler EOF (fim do arquivo)
			hora.setHora(scanner.nextByte());
			hora.setMinuto(scanner.nextByte());
			data.setDia(scanner.nextByte());
			data.setMes(scanner.nextByte());
			data.setAno(scanner.nextShort());
			DataHora datahora = new DataHora(data,hora);
			System.out.println(datahora);
		}
	}
}