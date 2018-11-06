package arquivo.restaurantehipotetico;

public class TesteCriarArqTexto {
		public static void main(String[] args)  {
		    
	        CriarArqTexto arq = new CriarArqTexto();
			
			arq.openFile();
			arq.adicionaRegistros();
			arq.closeFile();
	        
		}
}
