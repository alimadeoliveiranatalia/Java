package livraria;
public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    void mostrarDetalhes(){
    System.out.println("---------------------------------------------");
    System.out.println("Nome do Livro: "+nome);
    System.out.println("Descrição: "+descricao);
    System.out.println("R$"+valor);
    System.out.println("ISBN: "+isbn);
    System.out.println("---------------------------------------------");
    }
    
}




