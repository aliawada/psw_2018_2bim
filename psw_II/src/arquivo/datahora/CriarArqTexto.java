package arquivo.datahora;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CriarArqTexto {
	private FileWriter objEscrita;
	
	public void openFile() {
		try {
			objEscrita = new FileWriter("d:\\DataHora.txt");
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void adicionaRegistros() {
		Hora hora = new Hora();
		Data data = new Data();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da Hora e Data "
				+ "(hora,minuto,dia,mes,ano):");
		
		while (sc.hasNext()) { // Laço é encerrado ao ler EOF (fim do arquivo)
			hora.setHora(sc.nextByte());
			hora.setMinuto(sc.nextByte());
			data.setDia(sc.nextByte());
			data.setMes(sc.nextByte());
			data.setAno(sc.nextShort());
			
				try {
					objEscrita.append( String.format("%02d %02d %02d %02d %02d\n", hora.getHora(),hora.getMinuto(), data.getDia(), data.getMes(), data.getAno() ) );
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