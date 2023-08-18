package funciones;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Kontrol {
    public static void Guardar(ArrayList<String> archivo){
        Scanner s = new Scanner(System.in);
        String nombreArchivo = "";
        try{
            System.out.println("Ingrese el nombre del archivo");
            nombreArchivo = s.nextLine();
            BufferedWriter bw = new BufferedWriter(new FileWriter("./ArchivosFrutas/" + nombreArchivo + ".txt"));
            for(String linea : archivo){
                bw.write(linea + "\n");
            }
            bw.close();
        } catch (IOException ioe){
            System.out.println("No se puede escribir el archivo");
        }
    }
    public static ArrayList<String> Cargar(){
        Scanner s = new Scanner(System.in);
        ArrayList<String> archivo = new ArrayList<String>();
        String nombreArchivo = "";
        String linea = "";
        try{
            System.out.println("Ingrese el nombre del archivo con la extencion");
            nombreArchivo = s.nextLine();
            BufferedReader br = new BufferedReader(new FileReader("./ArchivosFrutas/" + nombreArchivo));
            while (linea != null){
                linea = br.readLine();
                archivo.add(linea);
            }
            br.close();
        }catch (FileNotFoundException fnfe){
            System.out.println("El archivo no se encuentra");
        }catch (IOException ioe){
            System.out.println("El archivo no se puede leer");
        }
        return archivo;
    }
}
