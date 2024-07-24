package funcionalidades;

import iphone.ComandosIphone;

public class NavegadorNaInternet implements ComandosIphone {

    @Override
    public void desbloquarIphone() {
        System.out.println("Desbloqueando Iphone no Navegador...");
        System.out.println("Pronto para uso!");
    }
    @Override
    public void bloquearTela() {
        System.out.println("Navegador do iPhone em modo standby.");
    }
    @Override
    public void fecharAplicativoAtual() {
        System.out.println("Fechando o Navegador");
    }
    public void exibirPagina(String url){
        System.out.println("Exibindo a página: " + url);
    }
    public void adicionarNovaAba(){
        System.out.println("Nova Aba Adicionada");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando a página.");
    }
}
