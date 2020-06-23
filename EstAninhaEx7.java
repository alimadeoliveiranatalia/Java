package est.aninha.ex.pkg7;
import java.util.Scanner;
public class EstAninhaEx7 {
    public static void main(String[] args) {
        int i;
        float A,B,C;
        System.out.println("Informe um valor, por favor.");
            Scanner  valor1;
            valor1 = new Scanner(System.in);
            A = valor1.nextFloat();
        System.out.println("Informe um segundo valor, sem repetir o primeiro, por favor.");
            Scanner valor2;
            valor2 = new Scanner(System.in);
            B = valor2.nextFloat();
        System.out.println("Informe um terceiro valor, sem repetir os anteriores, por favor");
            Scanner valor3;
            valor3 = new Scanner(System.in);
            C = valor3.nextFloat();
        System.out.println("Escolha um dos números a seguir: 1 , 2 ou 3?");
            Scanner vi;
            vi = new Scanner(System.in);
            i = vi.nextInt();
        if (i==1){
            if ((A<B) && (A<C)){
                if (B<C){
                System.out.println(A);
                System.out.println(B);
                System.out.println(C);}
                else {
                System.out.println(A);
                System.out.println(C);
                System.out.println(B);}
                            }
            if ((B<A) && (B<C)){
                if (C<A){
                System.out.println(B);
                System.out.println(C);
                System.out.println(A);}
                else{
                System.out.println(B);
                System.out.println(A);
                System.out.println(C);}
                            }
            if((C<A) &&(C<B)) {
                if (A<B){
                System.out.println(C);
                System.out.println(A);
                System.out.println(B);}
                else{
                System.out.println(C);
                System.out.println(B);
                System.out.println(A);}
                                }
        }
        if (i==2){
            if ((A>B) &&(A>C)) {
                if (B>C){
                System.out.println(A);
                System.out.println(B);
                System.out.println(C);}
                else{
                System.out.println(A);
                System.out.println(C);
                System.out.println(B);}
                                }
            if ((B>A)&& (B>C)) {
                if (A>C){
                System.out.println(B);
                System.out.println(A);
                System.out.println(C);}
                else{
                System.out.println(B);
                System.out.println(C);
                System.out.println(A);}
            }
            if ((C>A) && (C>B)) {
                if (A>B){
                System.out.println(C);
                System.out.println(A);
                System.out.println(B);}
                else{
                System.out.println(C);
                System.out.println(B);
                System.out.println(A);}
                                }
           
        }
        if (i==3){
            if ((A>B) && (A>C)){ 
            System.out.println(B);
            System.out.println(A);
            System.out.println(C);}
            if ((B>A) && (B>C)){
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);}
            if ((C>A) && (C>B)){
            System.out.println(A);
            System.out.println(C);
            System.out.println(B);}
        }

        
    }
    
}
