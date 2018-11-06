package arquivo.datahora;

import arquivos.*;

public class Principal {

	public static void main(String[] args) {
		Hora hora = new Hora((byte)4,(byte)20);
		Data data = new Data((byte)30,(byte)12,(short)2018);
		DataHora datahora = new DataHora(data,hora);
		
		ManipuladorArquivo.escritor("arquivoDataHora.txt",datahora.toString());
		ManipuladorArquivo.leitor("arquivoDataHora.txt");
		
		Serialize.serialize(datahora);
		Deserialize.deserialize(datahora);
		
		
		
	}

}
