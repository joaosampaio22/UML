public class AparelhoTelefonico {
    public static void main(String[] args) {
        Reprodutor reprodutor = new Reprodutor();  // instanciando classes reprodutor e navegador
        Navegador navegador = new Navegador();
        
        ligar();
        System.out.println("");  // quebra de linha apenas para melhor visualização no terminal
        System.out.println("Você possui um correio de voz.");
        iniciarCorreioVoz();  
        System.out.println("");
        navegador.exibirPagina();  //chamando métodos relacionados as classes instanciadas
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
        System.out.println("");
        reprodutor.selecionarMusica();
        reprodutor.tocar();
        System.out.println("");
        System.out.println("Alguém está te ligando...");
        reprodutor.pausar();
        atender();
    }

    public static void ligar(){   //o método precisa ser static para ser chamado no método main
        System.out.println("Ligando aparelho...");
        System.out.println("Aparelho ligado");
    }
    public static void atender(){
        System.out.println("Atendendo chamada");
    }
    public static void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }
}
