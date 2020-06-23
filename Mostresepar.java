package mostresepar;
import java.util.Scanner;
public class Mostresepar {
    public static void main(String[] args) {
        int resto, num;
        System.out.println("Informe um valor que seja inteiro, por favor");
        Scanner dado;
        dado = new Scanner(System.in);
        num = dado.nextInt();
        resto = num % 2;
        if (resto == 0) {
            System.out.println("É um número par");
        }
        else{
            System.out.println("É um número ínpar");
        }
    }
    
    
}
