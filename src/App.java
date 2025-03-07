public class App {
    public static void main(String[] args){
        iPhone meuIphone = new iPhone(8);
        meuIphone.ligar();

        meuIphone.getReprodutorMusical().selecionarMusica("Enjoy The Silence - Depeche Mode");
        meuIphone.getReprodutorMusical().tocar();
        meuIphone.getReprodutorMusical().pausar();

        meuIphone.getAparelhoTelefonico().ligar("+55 11 4002-8922");

        meuIphone.getNavegadorInternet().exibirPagina("https://www.youtube.com");
        meuIphone.getNavegadorInternet().adicionarNovaAba();
        meuIphone.getNavegadorInternet().exibirPagina("https://www.dio.me");

        meuIphone.desligar();
    }
}
