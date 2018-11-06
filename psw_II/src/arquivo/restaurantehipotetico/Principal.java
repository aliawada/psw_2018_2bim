package arquivo.restaurantehipotetico;

import arquivos.*;

public class Principal {

	public static void main(String[] args) {
		
		RestauranteHipotetico restaurante = new RestauranteHipotetico(25);
                
		restaurante.custoBebida(2.5F);
		restaurante.custoPrato(3.7F);
		
		restaurante.adicionarCliente(1);
		restaurante.adicionarBebida(1);
                
        restaurante.adicionarCliente(2);
		restaurante.adicionarBebida(2);
        restaurante.adicionarBebida(2);
        restaurante.adicionarCliente(2);
		restaurante.adicionarBebida(2);
		restaurante.adicionarCliente(2);
		restaurante.adicionarBebida(2);

        restaurante.fecharMesa(2);    
        
        ManipuladorArquivo.escritor("arquivoRestauranteHipotetico.txt", restaurante.toString());
        ManipuladorArquivo.leitor("arquivoRestauranteHipotetico.txt");  
        
        Serialize.serialize(restaurante);
        Deserialize.deserialize(restaurante);
    
}
}