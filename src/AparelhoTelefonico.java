public class AparelhoTelefonico {
    private boolean emChamada;
    private String numeroChamadaAtual;
    private int duracaoChamada;
    private boolean mutado;

    public AparelhoTelefonico(boolean emChamada, String numeroChamadaAtual, int duracaoChamada) {
        this.emChamada = emChamada;
        this.numeroChamadaAtual = numeroChamadaAtual;
        this.duracaoChamada = duracaoChamada;
        this.mutado = false;
    }

    public AparelhoTelefonico() {
    }
    public void ligar(String numero) {
        setEmChamada(true);
        setNumeroChamadaAtual(numero);
        System.out.println("Ligando para " + numero);
    }
    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz iniciado...");
    }
    public void atender(){
        setEmChamada(true);
    }
    public boolean isEmChamada() {
        return emChamada;
    }

    public void setEmChamada(boolean emChamada) {
        this.emChamada = emChamada;
    }


    public String getNumeroChamadaAtual() {
        return numeroChamadaAtual;
    }

    public void setNumeroChamadaAtual(String numeroChamadaAtual) {
        this.numeroChamadaAtual = numeroChamadaAtual;
    }

    public int getDuracaoChamada() {
        return duracaoChamada;
    }

    public void setDuracaoChamada(int duracaoChamada) {
        this.duracaoChamada = duracaoChamada;
    }

    public boolean isMutado() {
        return mutado;
    }

    public void setMutado(boolean mutado) {
        this.mutado = mutado;
    }
}
