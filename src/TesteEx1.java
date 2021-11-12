import java.util.Scanner;

public class TesteEx1 {
    public static void main(String[] args) {
        P_EX1 C = new P_EX1();
        int a,b,troco,n20,n10,n5,m2,m1;
        a=14;
        b=5;
        //Teste a
        troco=C.Troco(a);
        if (troco==36){
            System.out.println("Teste a Troco - Correto");
        }else{
            System.out.println("Teste a Troco - Errado");
        }
        n20=C.Notas20();
        if (n20==1) {
            System.out.println("Teste a Notas 20 - Correto");
        }else {
            System.out.println("Teste a Notas 20 - Errado");
        }

        n10=C.Notas10();
        if (n10==1) {
            System.out.println("Teste a Notas 10 - Correto");
        }else {
            System.out.println("Teste a Notas 10 - Errado");
        }

        n5=C.Notas5();
        if (n5==1) {
            System.out.println("Teste a Notas 20 - Correto");
        }else {
            System.out.println("Teste a Notas 20 - Errado");
        }
        m2=C.Moedas2();
        if (m2==0) {
            System.out.println("Teste a Moedas 2 - Correto");
        }else {
            System.out.println("Teste a Moedas 2 - Errado");
        }
        m1=C.Moedas1();
        if (m1==1) {
            System.out.println("Teste a Moedas 1 - Correto");
        }else {
            System.out.println("Teste a Moedas 1 - Errado");
        }
        //teste b
        troco=C.Troco(b);
        if (troco==45){
            System.out.println("Teste b Troco - Correto");
        }else{
            System.out.println("Teste b Troco - Errado");
        }

        n20=C.Notas20();
        if (n20==2) {
            System.out.println("Teste b Notas 20 - Correto");
        }else {
            System.out.println("Teste b Notas 20 - Errado");
        }

        n10=C.Notas10();
        if (n10==0) {
            System.out.println("Teste b Notas 10 - Correto");
        }else {
            System.out.println("Teste b Notas 10 - Errado");
        }

        n5=C.Notas5();
        if (n5==1) {
            System.out.println("Teste b Notas 20 - Correto");
        }else {
            System.out.println("Teste b Notas 20 - Errado");
        }
        m2=C.Moedas2();
        if (m2==0) {
            System.out.println("Teste b Moedas 2 - Correto");
        }else {
            System.out.println("Teste b Moedas 2 - Errado");
        }
        m1=C.Moedas1();
        if (m1==0) {
            System.out.println("Teste b Moedas 1 - Correto");
        }else {
            System.out.println("Teste b Moedas 1 - Errado");
        }


    }
}
