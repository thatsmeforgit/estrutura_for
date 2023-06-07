import java.util.Scanner;
class sequencialogica {
    public static void main(String[] args){
        int n=0, i=0;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        sc.close();

        for(i=1; i<=n;i = i+1){
            System.out.printf("%d %d %d\n",i, i*i, i*i*i);
            System.out.printf("%d %d %d\n",i, i*i+1, i*i*i+1);
        }

    }    
}
