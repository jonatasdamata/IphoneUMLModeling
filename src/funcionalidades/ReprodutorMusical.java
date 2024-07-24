package funcionalidades;

import iphone.ComandosIphone;

public class ReprodutorMusical implements ComandosIphone {
    @Override
    public void desbloquarIphone() {
        System.out.println("Desbloqueando Iphone para Reproduzir Música...");
        System.out.println("Pronto para uso!");
    }
    @Override
    public void bloquearTela() {
        System.out.println("Bloqueando a Tela do Iphone.");
    }
    @Override
    public void fecharAplicativoAtual() {
        System.out.println("Fechando o Reprodutor de Música.");
    }
    public void tocar(){
        System.out.println("Tocando Música...");
    }
    public void pausar(){
        System.out.println("Pausando a Música!");
    }
    public void selecionarMusica(String musica){
        System.out.println("Música: " + "'" + musica + "'" + " selecionada para reprodução.");
    }

}
