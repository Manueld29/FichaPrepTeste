public class P_Ex2 {
    public int Verificar(int ano){
        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 !=0)) {
            return 1;
        } else {
            return 0;
        }
    }
}
