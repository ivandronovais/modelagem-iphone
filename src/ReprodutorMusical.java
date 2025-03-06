public class ReprodutorMusical {
    private String musicaAtual;
    private int volume;
    private boolean emReproducao;

    public void tocar() {
        System.out.println("Tocando " + musicaAtual);
        emReproducao = true;
    }

    public void pausar() {
        System.out.println("Pausando" + musicaAtual + "...");
        setEmReproducao(false);
        setVolume(0);
    }

    public void selecionarMusica(String musica) {
    }

    public String getMusicaAtual() {
        return musicaAtual;
    }

    public void setMusicaAtual(String musicaAtual) {
        this.musicaAtual = musicaAtual;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isEmReproducao() {
        return emReproducao;
    }

    public void setEmReproducao(boolean emReproducao) {
        this.emReproducao = emReproducao;
    }

    

}
