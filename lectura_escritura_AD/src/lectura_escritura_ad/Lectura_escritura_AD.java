package lectura_escritura_ad;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Lectura_escritura_AD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileInputStream in = null; //generamos la ruta en null, para evitar problemas 

        try { // ruta del archivo donde se encuentra el txt con las notas 
            in = new FileInputStream("./src/lectura_escritura_ad/alumnosNotas.txt");

            int c;// numero entero que va leyendo la linea en linea 
            String cadena = ""; // cadena vacia 
            while ((c = in.read()) != -1) {
                cadena += ((char) c);// cuando c, lea y sea menor que -1 += escribimos la cadena 

            }

            // con cada linea que haya en el archivo, hacemos un sout de la cadena 
            System.out.println(cadena);

        } catch (IOException ex) {
            System.out.println("No se ha encontrado el archivo");
        }

    }
}
