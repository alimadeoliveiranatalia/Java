public class estruturas_repeticao {
    public static void main(String[] args){
    int i;
    System.out.println(" Utilizando FOR:");
        for (i=1; i<=10;i++){
        System.out.print(i);
        }
    System.out.println("Utilizando WHILE:");
    i=1; 
    while (i<=10){
        System.out.print(i);
        i =i+1;
    }
    System.out.println("Utilizando DO WHILE:");
    i=1;
    do{
        System.out.print(i);
        i=i+1;
    }
    while(i<=10);
    }
}


