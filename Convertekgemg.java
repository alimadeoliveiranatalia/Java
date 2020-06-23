package convertekgemg;
import java.util.Scanner;
public class Convertekgemg {
    public static void main(String[] args) {
        float lado, a ;
        System.out.println("Informe o tamanho do lado, por favor");
            Scanner guarda;
            guarda=new Scanner(System.in);
            lado = guarda.nextFloat();
            a=(lado)*(lado);
        System.out.println("A área deste quadrado é:");
        System.out.println(a);
    }
    
}
