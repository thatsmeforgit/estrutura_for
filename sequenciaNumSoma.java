import java.util.Scanner;
import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class sequenciaNumSoma {
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        
        //variables
        int m = 1;
        int n = 1;
        int cont = 0;
        int soma = 0;

        //in
        Scanner sc = new Scanner(System.in);
        
        while(n>0 && m>0){
            m = sc.nextInt();
            n = sc.nextInt();

            if(n<m){
                for(cont=n;cont<=m;cont++){
                    System.out.println(cont); 
                    soma = soma+cont;
            }
            } else if(m<n){
                for(cont=m;cont<=n;cont++){
                    System.out.println(cont);
                    soma = soma+cont;
                }
            }
            System.out.printf("Sum=%d\n",soma);
        }
        sc.close();

    }
 
}

