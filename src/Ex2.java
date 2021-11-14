import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner aa =new Scanner(System.in);
        System.out.println("Ano?");
        int a=aa.nextInt();
        P_Ex2 C = new P_Ex2();
        int n= C.Verificar(a);
        if (n==1){
            System.out.println(+a+" é Bissexto");
        }else{
            System.out.println(+a+" não é Bissexto");
        }

    }
}
