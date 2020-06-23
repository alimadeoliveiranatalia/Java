package losangoarea;

import java.util.Scanner;

public class Losangoarea {
    public static void main(String[] args){
    int x;
    Scanner dado;
    System.out.println("Digite um número");
    dado=new Scanner(System.in);
    x=dado.nextInt();
    switch (x) {
              
        case 1: System.out.println("Número 1");
                break;
        case 2: System.out.println("Número 2");
                break;
        default:System.out.println("Outro número");}
            
    }
    
}
