package edu.israel.segundasemana.poo.fundamentos.messenger;

public abstract class ServiçoMensagemInstantanea {

  public abstract void enviarMensagem();

  public abstract void receberMensagem();


  private void validarConectadoInternet(){
    System.out.println("Validando conexão com a internet");
  }

  private void salvarHistoricoMensagem() {
    System.out.println("Salvando histórico de mensagens");
  }
}
