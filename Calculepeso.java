package calculepeso;
import java.util.Scanner;
public class Calculepeso {
    public static void main(String[] args) {
        float peso, p15, p20,peso15,peso20;
        System.out.println("Informe seu peso");
        Scanner pes;
        pes=new Scanner(System.in);
        peso = pes.nextFloat();
            p15=(peso*15)/100;
            p20=(peso*20)/100;
            peso15=peso+p15;
            peso20=peso+p20;
        System.out.println("Se vc engordar 15% do seu peso vc vai pesar:");
                System.out.println(peso15);
        System.out.println("Se vc engordar 20% do seu peso, vc vai pesar:");
                System.out.println(peso20);
    }
    
}
