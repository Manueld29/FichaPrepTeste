import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        int a,troco,t,m,n,n20,n10,n5,m2,m1;
        Scanner aa= new Scanner(System.in);
        System.out.println("Valor da compra? ");
        a= aa.nextInt();
        P_EX1 C = new P_EX1();
        troco=C.Troco(a);
        t= C.getTroco();
        n20=C.Notas20(t);
        t= C.getTroco();
        n10=C.Notas10(t);
        t= C.getTroco();
        n5=C.Notas5(t);
        t= C.getTroco();
        m2=C.Moedas2(t);
        t= C.getTroco();
        m1=C.Moedas1(t);

        n=n20+n10+n5;
        m=m1+m2;

        System.out.println("Para o troco de "+troco+" : "+n20+" notas de 20, "+n10+" notas de 10, "+n5+" notas de 5 e "+m2+" moedas de 2, "+m1+" moedas de 1.");
        System.out.println("Total de notas = "+n+", total de moedas ="+m);
    }
}
