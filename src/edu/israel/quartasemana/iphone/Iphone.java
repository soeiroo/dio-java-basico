package edu.israel.quartasemana.iphone;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
  @Override
  public void pausar() {
    System.out.println("Pausando música");
  }

  @Override
  public void tocar() {
    System.out.println("Tocando música");
  }

  @Override
  public void selecionarMusica(String musica) {
    System.out.println("Selecionando música: " + musica);
  }

  @Override
  public void exibirPagina() {
    System.out.println("Exibindo página");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando página");
  }

  @Override
  public void ligar(String numero) {
    System.out.println("Ligando para:" + numero);
  }

  @Override
  public void atender() {
    System.out.println("Atendendo chamada");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz");
  }
}
