import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testeEx1 {

    P_EX1 Testes = new P_EX1();
    int v1, v2, r1, r2;

    @Test
    void Ttroco() {
        v1 = 14;
        r1 = 36;
        v2 = 5;
        r2= 45;
        Assertions.assertEquals(r1, Testes.Troco(v1));
        Assertions.assertEquals(r2, Testes.Troco(v2));
    }
    void TN20(){
        v1 = 36;
        r1 = 1;
        v2 = 19;
        r2= 0;
        Assertions.assertEquals(r1, Testes.Notas20(v1));
        Assertions.assertEquals(r2, Testes.Notas20(v2));
    }
    void TN10(){
        v1 = 36;
        r1 = 3;
        v2 = 9;
        r2= 0;
        Assertions.assertEquals(r1, Testes.Notas10(v1));
        Assertions.assertEquals(r2, Testes.Notas10(v2));
    }
    void TN5(){
        v1 = 36;
        r1 = 7;
        v2 = 4;
        r2= 0;
        Assertions.assertEquals(r1, Testes.Notas5(v1));
        Assertions.assertEquals(r2, Testes.Notas5(v2));
    }
    void TM2(){
        v1 = 15;
        r1 = 7;
        v2 = 1;
        r2= 0;
        Assertions.assertEquals(r1, Testes.Moedas2(v1));
        Assertions.assertEquals(r2, Testes.Moedas2(v2));
    }
    void TM1(){
        v1 = 15;
        r1 = 15;
        v2 = 0;
        r2= 0;
        Assertions.assertEquals(r1, Testes.Moedas1(v1));
        Assertions.assertEquals(r2, Testes.Moedas1(v2));
    }
}
