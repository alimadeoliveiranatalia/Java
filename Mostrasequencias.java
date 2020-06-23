package mostrasequencias;
import java.util.Scanner;
public class Mostrasequencias {
    public static void main(String[] args) {
        int num1,num2,num3,num4;
        System.out.println("Informe um valor, que seja inteiro, por favor");
            Scanner valor1;
            valor1=new Scanner(System.in);
            num1=valor1.nextInt();
        System.out.println("Informe um segundo valor, que seja inteiro, maior que o primeiro, por favor!");
            Scanner valor2;
            valor2=new Scanner(System.in);
            num2=valor2.nextInt();
        System.out.println("Informe um terceiro valor, também inteiro, maior que o segundo, por favor");
            Scanner valor3;
            valor3=new Scanner(System.in);
            num3=valor3.nextInt();
        System.out.println("Informe um valor, que seja inteiro, sem repetir os anteriores, por favor!");
            Scanner valor4;
            valor4=new Scanner(System.in);
            num4=valor4.nextInt();
        System.out.println("A ordem desses números é:");
        if (num4>num3){
            System.out.print(num4);
            System.out.print(num3);
            System.out.print(num2);
            System.out.print(num1);}
        if (num4>num2 && num4<num3){
            System.out.print(num3);
            System.out.print(num4);
            System.out.print(num2);
            System.out.print(num1);}
        if (num4>num1 && num4<num2){
            System.out.print(num3);
            System.out.print(num2);
            System.out.print(num4);
            System.out.print(num1);}
        if (num4<num1){
            System.out.print(num3);
            System.out.print(num2);
            System.out.print(num1);
            System.out.print(num4);}
        
    }
    
}
