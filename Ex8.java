package ex.pkg8;
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        float num1, num2, soma, raiz;
        int opcao;
        Scanner dado;
        dado = new Scanner (System.in);
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("Tecle 1 para saber a soma dos numeros que mencionaste");
        System.out.println("Tecle 2 para saber a raiz quadrada de um dos números");
            opcao = dado.nextInt();
            if (opcao == 1){
        Scanner valor1;
        valor1 = new Scanner (System.in);
        System.out.println("Informe um valor, por favor");
            num1 = valor1.nextFloat();
        Scanner valor2;
        valor2 = new Scanner (System.in);
        System.out.println("Informe um segundo valor, sem repetir o anterior, por favor");
            num2 = valor2.nextFloat();
            soma = num1+num2;
            System.out.println("A soma resultou em: ");
            System.out.print(soma);
            }
            if (opcao == 2){
        Scanner valor3;
        valor3 = new Scanner (System.in);
        System.out.println("Informe um valor, por favor.");
        num1 = valor3.nextFloat();
        raiz = (float) Math.sqrt(num1);
            System.out.println("A raiz quadrada desse número é:");
            System.out.print(raiz);}
            if ((opcao != 1) && (opcao !=2)){
            System.out.println("Não exite alternativa para esta opção");}
        
        
    }
    
}
