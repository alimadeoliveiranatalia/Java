package desconto;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
    float p1,pn,d;
    Scanner gal;
    gal=new Scanner(System.in);
        System.out.println("Por gentileza! Informe o preço");
    p1=gal.nextFloat();
    d=(p1*10)/100;
    pn=p1-d;
        System.out.println("Com um desconto de 10%, você deve pagar:"+pn);
    
    }
    
}
