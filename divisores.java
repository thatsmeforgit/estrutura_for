import java.util.Scanner;
class divisores {
    public static void main(String[] args){
    //var
    int n = 0, i = 0;
    Scanner sc = new Scanner(System.in);

    //in
    n = sc.nextInt();
    sc.close();
    
    //process & out
    for(i=1;i<=n;i++){
        if(n%i==0){
            System.out.println(i);
        }
    }
    }
}