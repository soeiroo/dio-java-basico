package edu.israel.segundasemana.poo.fundamentos.messenger;

public class MSNMessenger extends ServiçoMensagemInstantanea {
  @Override
  public void enviarMensagem(){
    System.out.println("Mensagem enviada por meio do MSN Messenger");
  }

  @Override
  public void receberMensagem(){
    System.out.println("Mensagem vinda por meio do MSN Messenger foi recebida");
  }
}
