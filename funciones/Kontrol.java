package funciones;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
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
        String linea = "p";
        boolean flag = true;
        try{
            System.out.println("Ingrese el nombre del archivo con la extencion");
            nombreArchivo = s.nextLine();
            BufferedReader br = new BufferedReader(new FileReader("./ArchivosFrutas/" + nombreArchivo));
            /*for(int i = 0; i < archivo.size() - 1; i ++){
                br.readLine();
            }*/
            while (linea != null && flag){
                linea = br.readLine();
                if (linea.isEmpty()){
                    flag = false;
                }else{
                    archivo.add(linea);
                }
            }
            br.close();
        }catch (FileNotFoundException fnfe){
            System.out.println("El archivo no se encuentra");
        }catch (IOException ioe){
            System.out.println("El archivo no se puede leer");
        }
        return archivo;
    }

    public static void Listar (){
        File f = new File("./ArchivosFrutas");
        String[] listaArchivos = f.list();
        for (String nombreDeArchivo : listaArchivos){
            System.out.println(nombreDeArchivo);
        }
    }

    public static void Debug(ArrayList<String> aListDebug){
        System.out.println("Estado Inicial: ");
        for(String linea : aListDebug){
            System.out.println(linea);
        }
        System.out.println(aListDebug.size());
        aListDebug.remove(aListDebug.size() - 1);
        System.out.println("Aplicado el remove con size() - 1");
        for(String linea : aListDebug){
            System.out.println(linea);
        }
    }
}
