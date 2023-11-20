
package lectura_escritura_ad;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;




public class Lectura_escritura_AD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
             FileInputStream in = null;
        
        try {
            in = new FileInputStream("./src/lectura_escritura_ad/alumnosNotas.txt");
            
            int c;
            String cadena = "";
            while ((c = in.read()) != -1) {
                cadena += ((char)c);
                
            }
            
            
            
            System.out.println(cadena);
            
        } catch (IOException ex) {
            System.out.println("No se ha encontrado el archivo");
        } finally {
            
            
            
            try {
                if(in != null) {
                in.close();
            }
            } catch (IOException ex) {
                System.out.println("No se ha podido cerrar el fichero");
            }
        }
}
}