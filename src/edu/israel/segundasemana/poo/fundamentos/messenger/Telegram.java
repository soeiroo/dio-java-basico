package edu.israel.segundasemana.poo.fundamentos.messenger;

public class Telegram extends ServiçoMensagemInstantanea{
  @Override
  public void enviarMensagem(){
    System.out.println("Mensagem enviada por meio do Telegram");
  }

  @Override
  public void receberMensagem(){
    System.out.println("Mensagem vinda por meio do Telegram foi recebida");
  }
}
