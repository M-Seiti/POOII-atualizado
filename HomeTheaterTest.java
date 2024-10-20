public class HomeTheaterTest {
    public static void main(String[] args) {
        Amplificador amplificador = new Amplificador();
        Luzes luzes = new Luzes();
        MaquinaDePipoca maquinaDePipoca = new MaquinaDePipoca();
        Projetor projetor = new Projetor();
        PlayerDeStreaming player = new PlayerDeStreaming();
        Telao telao = new Telao();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplificador, luzes, maquinaDePipoca, projetor, player, telao);

        homeTheater.iniciarFilme("O Senhor dos Anéis");

        // Simular o fim do filme
        homeTheater.fimDoFilme();
    }
}
