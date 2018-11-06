package arquivo.hierarquia.quadrilateros;

import arquivos.*;

public class Principal {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo(4,5,"a","a");
		Trapezio trapezio = new Trapezio(4,5,2,"a");
		Paralelogramo paralelogramo = new Paralelogramo(6,6,"a");
		
		ManipuladorArquivo.escritor("arquivoHierarquiaQuadrilateros.txt", retangulo.toString() + "\nÁrea: " + retangulo.calcularArea());
		ManipuladorArquivo.escritor("arquivoHierarquiaQuadrilateros.txt", trapezio.toString() + "\nÁrea: " + trapezio.calcularArea());
		ManipuladorArquivo.escritor("arquivoHierarquiaQuadrilateros.txt", paralelogramo.toString() + "\nÁrea: " + paralelogramo.calcularArea());
		ManipuladorArquivo.leitor("arquivoHierarquiaQuadrilateros.txt");
		
		Serialize.serialize(retangulo);
		Deserialize.deserialize(retangulo);
		Serialize.serialize(trapezio);
		Deserialize.deserialize(trapezio);
		Serialize.serialize(paralelogramo);
		Deserialize.deserialize(paralelogramo);
		
	}

}