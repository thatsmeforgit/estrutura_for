import java.util.Scanner;
public class primos {
    public static void main(String[] args){
    //var
    Scanner sc = new Scanner(System.in);
    int valor, i, n_div;

    //in
    System.out.println("Digite um valor: ");
    valor = sc.nextInt();
    sc.close();

    //process & out
    n_div=0;
    for (i=1;i<=10;i++){
        if(valor%2==0){
            n_div++;
        }
    }

    if(n_div < 3){
        System.out.println("É primo.");
    } else {
        System.out.println("Não é primo.");
    }
    
    }
}
