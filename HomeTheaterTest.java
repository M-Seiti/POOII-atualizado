public class HomeTheaterTest {
    public static void main(String[] args) {
        // Criando os objetos dos dispositivos
        Amplificador amplificador = new Amplificador();
        Luzes luzes = new Luzes();
        MaquinaDePipoca maquinaDePipoca = new MaquinaDePipoca();
        Projetor projetor = new Projetor();
        PlayerDeStreaming player = new PlayerDeStreaming();
        Telao telao = new Telao();

        // Criando a fachada
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplificador, luzes, maquinaDePipoca, projetor, player, telao);

        // Iniciar filme
        homeTheater.iniciarFilme("O Senhor dos Anéis");

        // Simular o fim do filme
        homeTheater.fimDoFilme();
    }
}
