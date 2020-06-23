package livraria;
public class Livraria {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "Java, novas aplicações";
        livro.descricao = "Novo recursos da linguagem";
        livro.valor = 60.50;
        livro.isbn = "978-85-66250-46-6";
        
        livro.mostrarDetalhes();
     
        Livro arduino = new Livro();
        arduino.nome = "Projetos com Microcontroladores";
        arduino.descricao = "Aprenda sem queimar componentes!";
        arduino.valor = 35.05;
        arduino.isbn = "234-85-66434-45-9";
        
        arduino.mostrarDetalhes();
        
        
    }
    
}
