public class P_EX1 {
     private int troco=0;

    public int getTroco() {
        return troco;
    }
    public void setTroco(int troco) {
        this.troco = troco;
    }
    public int Troco(int valor){
        int t =50-valor;
        setTroco(t);
        return t;
    }

    public int Notas20(int t) {
        int resultado=0;
        for (int x = 20; x <= t; resultado++) {
            t = t - 20;
        }
        setTroco(t);
        return resultado;
    }
    public int Notas10(int t) {
        int resultado=0;
        for (int x = 10; x <= t; resultado++) {
            t = t - 10;
        }
        setTroco(t);
        return resultado;
    }
    public int Notas5(int t) {
        int resultado=0;
        for (int x = 5; x <= t; resultado++) {
            t = t - 5;
        }
        setTroco(t);
        return resultado;
    }
    public int Moedas2(int t) {
        int resultado=0;
        for (int x = 2; x <= t; resultado++) {
            t = t - 2;
        }
        setTroco(t);
        return resultado;
    }
    public int Moedas1(int t) {
        int resultado=0;
        for (int x = 1; x <= t; resultado++) {
            t = t- 1;
        }
        setTroco(t);
        return resultado;
    }
}
