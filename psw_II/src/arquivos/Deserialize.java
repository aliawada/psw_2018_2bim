package arquivos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Deserialize
{
	public static void deserialize(Serializable objeto) {
      try
      {
         FileInputStream fileIn = new FileInputStream("arquivoSerializable.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         objeto = (Serializable) in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i)
      {
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c)
      {
         System.out.println("Class not found");
         c.printStackTrace();
         return;
      }
      System.out.println("Objeto toString: " + objeto.toString());
   
}
}