// Pergunte um número ao usuário e em seguida informe se 
// o número digitado é um número perfeito. 
// Um número perfeito é aquele que é igual à soma dos seus 
// divisores menores que ele. 
// Exemplo:
// 6 tem como divisores 1, 2 e 3.
// logo 1+2+3 = 6. então, 6 é um número perfeito.

// 9 tem como divisores: 1 e 3 
// logo 1+3 = 4. Então 9 não é um número perfeito. 

import java.util.Scanner;

public class num_perfeito {
    public static void main(String[] args){
    //var
    Scanner sc = new Scanner(System.in);  
    int i = 0, n = 0 , ndiv;

    //in
    System.out.println("Digite um valor: ");
    n = sc.nextInt();
    sc.close();

    //process & out
    ndiv = 0;
    for(i=1; i<n ; i++){
       if(n%2==0){
        ndiv++;
       } 
    }
    System.out.printf("Numero de divisores: %d\n",ndiv);
    }
}
