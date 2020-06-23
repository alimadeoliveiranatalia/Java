package caneta;
public class Canea {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Uma caneta "+this.cor);
        System.out.println("Está tampada? "+this.tampada);
        System.out.println("Qual o modelo? "+this.modelo);
        System.out.println("De quanto é a ponta? "+this.ponta);
        System.out.println("De quanto tá carga? "+this.carga);
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
            }
        else{
            System.out.println("Estou Rabiscando");}
    }
    void tampar(){
        this.tampada = true;}
    void destampar(){
        this.tampada = false;
    }
}
