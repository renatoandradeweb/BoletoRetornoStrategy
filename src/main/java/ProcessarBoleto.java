public class ProcessarBoleto {

    public ProcessarBoleto(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    private LeituraRetorno leituraRetorno;
    public void processar(String nomeArquivo) {
       var lista = leituraRetorno.lerArquivo(nomeArquivo);
        System.out.println(lista);
    }

    public void setLeituraRetorno(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }
}
