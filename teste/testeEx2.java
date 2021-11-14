import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testeEx2 {
    P_Ex2 Testes = new P_Ex2();
    int n1, n2, n3, r1, r2, r3;

    @Test
    void Tverificar() {
        n1 = 1988; //bisexto multiplo de 4 e não de 100
        r1 = 1;
        n2 = 2000;    //bisexto multiplo de 400
        r2 = 1;
        n3 = 1998;        // nao bisexto
        r3 = 0;
        Assertions.assertEquals(r1, Testes.Verificar(n1));
        Assertions.assertEquals(r2, Testes.Verificar(n2));
        Assertions.assertEquals(r3, Testes.Verificar(n3));
    }
}