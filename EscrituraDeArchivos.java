import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraDeArchivos {
    public static void main (String[] args){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("frutas.txt"));
            
            bw.write("naranja\n");
            bw.write("mandarina\n");
            bw.write("limon\n");

            bw.close();
        } catch (IOException ioe){
            System.out.println("No se puede escribir el archivo");
        }
    }
}
