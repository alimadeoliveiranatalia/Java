package aninhada;

import java.util.Scanner;

public class Aninhada {
    public static void main(String[] args) {
    System.out.println("Informe um número do tipo inteiro, por favor");
    int num1,num2,num3;
        Scanner sequencia;
        sequencia=new Scanner(System.in);
        num1=sequencia.nextInt();
    System.out.println("Informe um segundo número inteiro, sem repetir o primeiro, por favor");
        Scanner valor2;
        valor2=new Scanner(System.in);
        num2=valor2.nextInt();
    System.out.println("Informe um terceiro numero inteiro, sem repetir o primeiro e o segundo, por favor");
        Scanner valor3;
        valor3=new Scanner(System.in);
        num3=valor3.nextInt();
        if (num1<num2 && num1<num3){
            if (num2<num3){
                System.out.println(num1);
                System.out.println(num2);
                System.out.println(num3);}
            else{
                System.out.println(num1);
                System.out.println(num3);
                System.out.println(num2);
            }
        }
        if (num2<num1 && num2<num3){
            if(num1<num3){
                System.out.println(num2);
                System.out.println(num1);
                System.out.println(num3);}
            else{
                System.out.println(num2);
                System.out.println(num3);
                System.out.println(num1);}
        }
        if (num3<num1 && num3<num2){
            if (num1<num2){
                System.out.println(num3);
                System.out.println(num1);
                System.out.println(num2);}
            else{
                System.out.println(num3);
                System.out.println(num2);
                System.out.println(num1);}
        }
    }
   
}
