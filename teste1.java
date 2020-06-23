package teste1;

import java.util.Scanner;

public class teste1 {
	
	public static void main (String args[])
	{
	    //Scanner dados;
	    int valor;
	    
	    Scanner dados = new Scanner(System.in);
	    
	    valor = dados.nextInt();
	    dados.close();
	    
		System.out.print("Valor:"+valor);
		
	}
	

}
