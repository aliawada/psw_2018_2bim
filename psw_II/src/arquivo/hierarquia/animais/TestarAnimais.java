package arquivo.hierarquia.animais;

import arquivos.*;

public class TestarAnimais {

	public static void main(String[] args) {
		
		Peixe peixe = new Peixe("Tubarão",300,0,"Cinzento","Mar",1.5F,"Barbatanas e cauda");
		
		Mamifero tubarao = new Mamifero("Camelo",150,4,"Amarelo","Terra",2,"cactos");
		
		Mamifero ursodocanada = new Mamifero("Urso-do-Canadá",180,4,"Vermelho","Terra",0.5F,"Mel");
		
		ManipuladorArquivo.escritor("arquivoHierarquiaAnimal.txt", peixe.toString());
		ManipuladorArquivo.escritor("arquivoHierarquiaAnimal.txt", tubarao.toString());
		ManipuladorArquivo.escritor("arquivoHierarquiaAnimal.txt", ursodocanada.toString());
		ManipuladorArquivo.leitor("arquivoHierarquiaAnimal.txt");
		
		Serialize.serialize(peixe);
		Deserialize.deserialize(peixe);
		
		Serialize.serialize(tubarao);
		Deserialize.deserialize(tubarao);
		
		Serialize.serialize(ursodocanada);
		Deserialize.deserialize(ursodocanada);
		
		CriarArqTexto criararq = new CriarArqTexto();
		criararq.openFile();
		criararq.adicionaRegistros();
		criararq.closeFile();
	}

}