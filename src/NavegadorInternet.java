public class NavegadorInternet {
    private String paginaAtual;
    private int abasAbertas;
    private boolean carregando;
    
    public NavegadorInternet(String paginaAtual, int abasAbertas, boolean carregando) {
        this.paginaAtual = paginaAtual;
        this.abasAbertas = abasAbertas;
        this.carregando = carregando;
    }

    public void exibirPagina(String url) {

    }

    public void adicionarNovaAba() {

    }

    public void atualizarPagina() {

    }

    public String getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(String paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public int getAbasAbertas() {
        return abasAbertas;
    }

    public void setAbasAbertas(int abasAbertas) {
        this.abasAbertas = abasAbertas;
    }

    public boolean isCarregando() {
        return carregando;
    }

    public void setCarregando(boolean carregando) {
        this.carregando = carregando;
    }
}
