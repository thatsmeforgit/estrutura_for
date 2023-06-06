import java.util.Scanner;
public class primos_v2 {
    public static void main(String[] args){
        //var
        Scanner sc = new Scanner(System.in);
        int valor, i;
        boolean eh_primo;
    
        //in
        System.out.println("Digite um valor: ");
        valor = sc.nextInt();
        sc.close();
    
        //process & out
        eh_primo = true;
        for (i=1;i<valor;i++){
            if(valor%2==0){
                eh_primo = false;
                System.out.println("Não é primo.");
                break;
            }
            System.out.printf("== %d : %b ==\n", i, eh_primo);
        }
    
        if(eh_primo){
            System.out.println("É primo.");
        }
    
    }
}
