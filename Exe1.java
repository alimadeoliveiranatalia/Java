import static java.lang.System.in;
import java.util.Scanner;
public class Exe1 {
    public static void main(String[] args) {
        double sf, vendas,comisao, sn;
        System.out.println("Informe seu salário fixo, por favor.");
        Scanner numero;
        numero= new Scanner(in);
            sf = numero.nextDouble();
        
        System.out.println("Informe o valor de vendas este mes");
            vendas = numero.nextDouble();
        comisao = (vendas*4)/100;
        sn = sf+comisao;
    System.out.println("Sua comissão este mês foi de R$" );
    System.out.println(comisao);
    System.out.println("Seu salário este mes é de R$" );
    System.out.println(sn);
    }
    
}

