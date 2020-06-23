/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lemedia;
import java.util.Scanner;
/**
 *
 * @author Natalia
 */
public class Lemedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float nota1, nota2, nota3, media;
   Scanner object; 
   object = new Scanner (System.in);
   System.out.println("Infome as notas 1");
   nota1 = object.nextFloat();
    System.out.println("Infome as notas 2");
   nota2 = object.nextFloat();
    System.out.println("Infome as notas 3");
   nota3 = object.nextFloat();
  
   media = (nota1+nota2+nota3)/3;
       System.out.println("A sua média foi:"+media);
    }
    
}
