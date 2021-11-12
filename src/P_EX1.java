public class P_EX1 {
     int troco=0;

    public int Troco(int valor){
        troco =50-valor;
        return troco;
    }

    public int Notas20() {
        int resultado=0;
        for (int x = 20; x <= troco; resultado++) {
            troco = troco - 20;
        }
        return resultado;
    }
    public int Notas10() {
        int resultado=0;
        for (int x = 10; x <= troco; resultado++) {
            troco = troco - 10;
        }
        return resultado;
    }
    public int Notas5() {
        int resultado=0;
        for (int x = 5; x <= troco; resultado++) {
            troco = troco - 5;
        }
        return resultado;
    }
    public int Moedas2() {
        int resultado=0;
        for (int x = 2; x <= troco; resultado++) {
            troco = troco - 2;
        }
        return resultado;
    }
    public int Moedas1() {
        int resultado=0;
        for (int x = 1; x <= troco; resultado++) {
            troco = troco - 1;
        }
        return resultado;
    }

}
