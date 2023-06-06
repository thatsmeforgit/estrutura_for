import java.util.Scanner;
class tabuada {
    public static void main(String[] args){
        //var 
        int x = 0, i = 0, result = 0;
        Scanner sc = new Scanner(System.in);

        //in
        System.out.println("Entre com o valor: ");
        x = sc.nextInt();
        sc.close();

        //process
        for (i=1; i<=10;i++){
            result = x * i;
            System.out.printf("%d x %d = %d", x , i , result);
        }
    }
}