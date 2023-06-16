import java.util.Scanner;
import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class sequenciaLogica {
 
    public static void main(String[] args) throws IOException {
        
        //in
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        //process & out
        for(int i=1;i<=n;i++){
            System.out.printf("%d %d %d\n", i, i*i, i*i*i);
            System.out.printf("%d %d %d\n", i, i*i+1, i*i*i+1);
        }
    }
 
}