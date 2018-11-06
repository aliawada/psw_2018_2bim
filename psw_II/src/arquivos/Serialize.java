package arquivos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialize
{
	public static void serialize(Serializable objeto) {
      try
      {
         FileOutputStream fileOut = new FileOutputStream("arquivoSerializable.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(objeto);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in arquivoSerializable.ser\n");
      }catch(IOException i)
      {
          i.printStackTrace();
      }
	}
}