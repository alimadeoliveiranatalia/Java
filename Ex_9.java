package ex_9;
import java.util.Scanner;
public class Ex_9 {
    public static void main(String[] args) {
        int dia, mes, ano, hora, min;
        Scanner guarda_dia;
        guarda_dia = new Scanner(System.in);
        System.out.print("Informe o dia do seu aniversário, por favor");
            dia = guarda_dia.nextInt();
        Scanner guarda_mes;
        guarda_mes = new Scanner(System.in);
        System.out.print("Informe o mês do seu aniversário, por favor");
            mes = guarda_mes.nextInt();
        Scanner guarda_ano;
        guarda_ano = new Scanner(System.in);
        System.out.print("Informe o ano em que você nasceu, por favor");
            ano = guarda_ano.nextInt();
        Scanner guarda_hora;
        guarda_hora = new Scanner(System.in);
        System.out.print("Informe a hora em que você nasceu");
            hora = guarda_hora.nextInt();
        Scanner guarda_min;
        guarda_min = new Scanner(System.in);
        System.out.print("Informe os minutos em que você nasceu");
            min = guarda_min.nextInt();
        if (mes == 1){
        System.out.print("Janeiro");}
        if (mes == 2){
        System.out.print("Fevereiro");}
        if (mes == 3){
        System.out.print("Março");}
        if (mes == 4){
        System.out.print("Abril");}
        if (mes == 5){
        System.out.print("Maio");}
        if (mes == 6){
        System.out.print("Junho");}
        if (mes == 7){
        System.out.print("Julho");}
        if (mes == 8){
        System.out.print("Agosto");}
        if (mes == 9){
        System.out.print("Setembro");}
        if(mes == 10){
        System.out.print("Outubro");}
        if (mes == 11){
        System.out.print("Novembro");}
        if (mes == 12){
        System.out.print("Dezembro");}
     System.out.println("Você nasceu em:");
     System.out.print(dia);
     System.out.print(" / ");
     System.out.print(mes);
     System.out.print(" / ");
     System.out.print(ano);
     System.out.print(" as ");
     System.out.print(hora);
     System.out.print(":");
     System.out.print(min);
        
        
    }
    
}
