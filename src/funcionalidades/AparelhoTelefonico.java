package funcionalidades;

import iphone.ComandosIphone;

public class AparelhoTelefonico implements ComandosIphone {
    @Override
    public void desbloquarIphone() {
        System.out.println("Desbloqueando Iphone no Aparelho Telefônico");
        System.out.println("Pronto para uso!");
    }
    @Override
    public void bloquearTela() {
        System.out.println("Bloqueando a Tela do Iphone no Aparelho Telefônico");
    }
    @Override
    public void fecharAplicativoAtual() {
        System.out.println("Fechando o Aplicativo de Ligação");
    }
    public void ligar(String numero){
        System.out.println("Ligando para: " + numero);
    }
    public void atender(){
        System.out.println("Atendeu o Telefone!");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando o Correio de Voz.");
    }
}
