public class Principal {
    public static void main(String[] args) {
        /*
        LeituraRetorno leituraRetorno = new LeituraRetornoBancoBrasil();
        ProcessarBoleto processador = new ProcessarBoleto(leituraRetorno);
        processador.processar("banco-brasil-1.csv");
        */
        LeituraRetorno leituraRetorno = new LeituraRetornoBradesco();
        ProcessarBoleto processador = new ProcessarBoleto(leituraRetorno);
        processador.processar("bradesco-1.csv");
    }
}
