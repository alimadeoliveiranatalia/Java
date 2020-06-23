package mediaponderada;
import java.util.Scanner;
public class Mediaponderada {

    public static void main(String[] args) {
         float nota1,nota2,nota3,peso1,peso2,peso3,media;
         Scanner arquivo;
        arquivo=new Scanner (System.in);
        System.out.println("Informe nota 1");
    nota1=arquivo.nextFloat();
        System.out.println("Informe nota 2");
    nota2=arquivo.nextFloat();
        System.out.println("Informe nota 3");
    nota3=arquivo.nextFloat();
    peso1=1;
    peso2=2;
    peso3=3;
          media=(nota1*peso1+nota2*peso2+nota3*peso3)/(peso1+peso2+peso3);
        System.out.println("A sua média foi:"+media);
    }
    
}
