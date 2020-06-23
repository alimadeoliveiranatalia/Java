package subtracao;

import java.util.Scanner;

public class Subtracao {

       public static void main(String[] args) {
        float valor1, valor2, total;
       Scanner armaz;
       armaz=new Scanner (System.in);
           System.out.println("Informe o primeiro valor");
       valor1=armaz.nextFloat();
           System.out.println("Informe o segundo valor");
       valor2=armaz.nextFloat();
       total=valor1-valor2;
           System.out.println("O resultado foi:"+total);
       
       }
    
}
