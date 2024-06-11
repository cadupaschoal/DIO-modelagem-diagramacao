public class Iphone implements reprodutorMusical, NavegadorInternet, AparelhoCelular {
    public static void main(String[] args) {
        Iphone phone = new Iphone();

        phone.tocar();
        phone.atender();
        phone.selecionarMusica("Construção");
        phone.ligar("99999-9999");
        phone.atender();
        phone.iniciarCorreioVoz();
        phone.exibirPagina("youtube.com");
        phone.abrirNovaAba();
        phone.atualizarPagina();
    }
    public void tocar() {
        System.out.print("Reproduzindo música.\n");
    }
    public void pausar(){
        System.out.print("Pausando música.\n");
    }
    public void selecionarMusica(String musica){
        System.out.print("Música " + musica + " selecionada.\n");

    }
    public void ligar(String numero){
        System.out.print("Ligando para o número: " + numero + ".\n");
    }
    public void atender(){
        System.out.print("Atendento a chamada.\n" );
    }
    public void iniciarCorreioVoz(){
        System.out.print("Iniciando correio de voz.\n" );
    }
    public void exibirPagina(String url){
        System.out.print("Acessando a url: " + url + ".\n");
    }
    public void abrirNovaAba(){
        System.out.print("Abrindo nova aba.\n");
    }
    public void atualizarPagina(){
        System.out.print("Atualizando pagina.\n");
    }
}