package aniversario;
import java.util.Scanner;
public class Aniversario {
    public static void main(String[] args) {
        int dia,mes,ano,hora,min;
        String mostra_mes = null;
        System.out.println("Informe o dia em que você nasceu,  por favor");
        Scanner guarda_dia;
        guarda_dia = new Scanner(System.in);
            dia = guarda_dia.nextInt();
        System.out.println("Informe o mês em que você nasceu, por favor");
        Scanner guarda_mes;
        guarda_mes = new Scanner(System.in);
            mes = guarda_mes.nextInt();
        
        if (mes == 1){
            mostra_mes = "Janeiro";}
        if (mes == 2){
            mostra_mes = "Fevereiro";}
        if (mes == 3){
            mostra_mes = "Março";}
        if (mes == 4){
            mostra_mes = "Abril";}
        if (mes == 5){
            mostra_mes = "Maio";}
        if (mes == 6){
            mostra_mes = "Junho";}
        if (mes ==7){
            mostra_mes = "Julho";}
        if (mes == 8){
            mostra_mes = "Agosto";}
        if (mes == 9){
            mostra_mes = "Setembro";}
        if (mes == 10) {
            mostra_mes = "Outubro";}
        if (mes == 11){
            mostra_mes = "Novembro";}
        if (mes == 12){
            mostra_mes = "Dezembro";}
        System.out.println("Informe o ano em que você nasceu, por favor");
        Scanner guarda_ano;
        guarda_ano = new Scanner(System.in);
            ano = guarda_ano.nextInt();
        System.out.println("Informe a hora em que você nasceu, por favor");
        Scanner guarda_hora;
        guarda_hora = new Scanner(System.in);
            hora = guarda_hora.nextInt();
        System.out.println("Informe os minutos em que você nasceu, por favor");
        Scanner guarda_min;
        guarda_min = new Scanner(System.in);
            min = guarda_min.nextInt();
            
        
            System.out.println("Você nasceu em:");
            System.out.print(dia);
            System.out.print("/");
            System.out.print(mostra_mes);
            System.out.print("/");
            System.out.print(ano);
            System.out.print(" ");
            System.out.print(hora);
            System.out.print(":");
            System.out.println(min);

    }
    
}
