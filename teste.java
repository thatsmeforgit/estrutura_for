import java.util.Scanner;
public class teste {
    public static void main(String[] args){
        
        int soma = 0, m = 1, n = 1;
        
        Scanner sc = new Scanner(System.in);

        while(m<0 && n<0){
            m = sc.nextInt();
            n = sc.nextInt();
            
        
            if(n<m){
                for(int i=n;i<=m;i++){
                    System.out.println(i);
                    soma = soma + i;
                }
            } else if (m<n){
                for(int i=m;i<=n;i++){
                    System.out.println(i);
                    soma = soma + i;
                }
            }
            System.out.printf("Sum=%d",soma);
        }
        sc.close();
    }
}