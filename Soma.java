package teste2;

import java.util.Scanner;

public class Soma {

	public static void main (String[] args) {

		int n1, n2, n3, n4, resultado;
		Scanner dado;
		dado=new Scanner(System.in);
		n1=dado.nextInt();
		n2=dado.nextInt();
		n3=dado.nextInt();
		n4=dado.nextInt();
		resultado=n1+n2+n3+n4;
		System.out.println("O resultado final foi:"resultado);
	}

}