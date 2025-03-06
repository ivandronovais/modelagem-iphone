public class iPhone {
    private int armazenamento;
    private ReprodutorMusical reprodutor;
    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;

    public iPhone(int armazenamento) {
        this.armazenamento = armazenamento;
        this.reprodutor = new ReprodutorMusical();
        this.telefone = new AparelhoTelefonico(false, null, armazenamento);
        this.navegador = new NavegadorInternet();
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutor;
    }

    public void setReprodutorMusical(ReprodutorMusical reprodutorMusical) {
        this.reprodutor = reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return telefone;
    }

    public void setAparelhoTelefonico(AparelhoTelefonico aparelhoTelefonico) {
        this.telefone = aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegador;
    }

    public void setNavegadorInternet(NavegadorInternet navegadorInternet) {
        this.navegador = navegadorInternet;
    }

    public void ligar() {
        System.out.println("iPhone Ligando...");
    }

    public void desligar() {
        System.out.println("iPhone Desligando...");
    }

    public String bloquearTela() {
        return "Deslize para desbloquear";
    }
}
