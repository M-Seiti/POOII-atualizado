public class HomeTheaterFacade {
    private Amplificador amplificador;
    private Luzes luzes;
    private MaquinaDePipoca maquinaDePipoca;
    private Projetor projetor;
    private PlayerDeStreaming player;
    private Telao telao;

    // Construtor
    public HomeTheaterFacade(Amplificador amplificador, Luzes luzes, MaquinaDePipoca maquinaDePipoca, Projetor projetor, PlayerDeStreaming player, Telao telao) {
        this.amplificador = amplificador;
        this.luzes = luzes;
        this.maquinaDePipoca = maquinaDePipoca;
        this.projetor = projetor;
        this.player = player;
        this.telao = telao;
    }

    // Método para iniciar o filme
    public void iniciarFilme(String filme) {
        System.out.println("Preparando para assistir ao filme...");

        maquinaDePipoca.ligar();
        maquinaDePipoca.rebentarPipoca();
        luzes.desligar();
        telao.abaixar();
        projetor.ligar();
        amplificador.ligar();
        amplificador.ajustarVolume(10);
        player.ligar();
        player.play(filme);

        System.out.println("Filme iniciado. Aproveite!");
    }

    // Método para encerrar o filme
    public void fimDoFilme() {
        System.out.println("Encerrando sessão de cinema...");

        player.desligar();
        amplificador.desligar();
        projetor.desligar();
        telao.subir();
        luzes.ligar();
        maquinaDePipoca.desligar();

        System.out.println("Filme encerrado. Até a próxima sessão!");
    }
}
