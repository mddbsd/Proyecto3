package funciones;
import java.util.Scanner;

public class Validaciones {
    public static String SiNo(String fOp){
        Scanner s = new Scanner(System.in);
        while(!fOp.equals("s") && !fOp.equals("n")){
            System.out.println("Opcion invalida, ingrese nuevamente");
            fOp = s.nextLine();
        }
        return fOp;
    }
}
