package usuario;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorNaInternet;
import funcionalidades.ReprodutorMusical;

public class Usuario {
    public static void main(String[] args) {

        // Criando instâncias dos objetos
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorNaInternet navegador = new NavegadorNaInternet();

        System.out.println("------------------------------------------");
        // Utilizando o Reprodutor Musical
        reprodutor.desbloquarIphone();
        reprodutor.selecionarMusica("Saulo - Outra vez");
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.fecharAplicativoAtual();
        reprodutor.bloquearTela();

        System.out.println("------------------------------------------");
        //Utilizando o Aparelho Telefônico
        telefone.desbloquarIphone();
        telefone.ligar("71994523698");
        telefone.atender();
        telefone.iniciarCorreioVoz();
        telefone.fecharAplicativoAtual();
        telefone.bloquearTela();

        System.out.println("------------------------------------------");
        //Utilizando o Navegador na Internet
        navegador.desbloquarIphone();
        navegador.exibirPagina("https://www.github.com/jonatasdamata");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
        navegador.fecharAplicativoAtual();
        navegador.bloquearTela();

    }
}
