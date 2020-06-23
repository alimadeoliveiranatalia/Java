package medcond;

import java.util.Scanner;

public class Medcond {
    public static void main(String[] args) {
    float n1,n2,n3,m;
    System.out.println("Nota do trabalho");
        Scanner guarda;
        guarda=new Scanner(System.in);
        n1=guarda.nextFloat();
    System.out.println("Nota da avaliação");
        Scanner guarda1;
        guarda1=new Scanner(System.in);
        n2=guarda1.nextFloat();
    System.out.println("Nota do exame final");
        Scanner guarda2;
        guarda2=new Scanner(System.in);
        n3=guarda2.nextFloat();
    m = (n1*2+n2*3+n3*5)/10;
    
    if (m>=8 && m<10){
        System.out.println("Obteve conceito A");
    }
    else{
        System.out.println("Obteve conceito B");
    }
    }
    
}
