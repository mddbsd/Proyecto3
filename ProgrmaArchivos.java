import java.util.ArrayList;
import funciones.*;
import java.util.Scanner;

public class ProgrmaArchivos {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<String> frutas = new ArrayList<String>();
        boolean flag = true;
        do{
            funciones.Menues.MenuPrincipal();
            switch(s.nextLine()){
                case "1":
                    String op = "";
                    do{
                        System.out.print("Ingrese fruta: ");
                        frutas.add(s.nextLine());
                        System.out.println("Desea ingresar mas frutas (s/n)");
                        op = s.nextLine();
                        op = funciones.Validaciones.SiNo(op);
                    }while(op.equals("s"));
                    break;
                case "2":
                    for (String frutaAux : frutas){
                        System.out.println(frutaAux);
                    }
                    break;
                case "3":
                    frutas = funciones.Kontrol.Cargar();
                    System.out.println("El archivos se cargo correctamente");
                    break;
                case "4":
                    funciones.Kontrol.Guardar(frutas);
                    System.out.println("El archivo se guardo correctamente");
                    break;
                case "5":
                    flag = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while(flag);
    }
}
