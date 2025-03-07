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
        setPaginaAtual(url);
        setCarregando(true);
        System.out.println(getPaginaAtual());
        setCarregando(false);
    }

    public void adicionarNovaAba() {
        setAbasAbertas(getAbasAbertas()+1);
    }

    public void atualizarPagina() {
        setCarregando(true);
        System.out.println(getPaginaAtual());
        setCarregando(false);
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
