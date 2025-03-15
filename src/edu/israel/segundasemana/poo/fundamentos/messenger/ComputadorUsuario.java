package edu.israel.segundasemana.poo.fundamentos.messenger;

public class ComputadorUsuario {
  public static void main(String[] args) {
    MSNMessenger app = new MSNMessenger();
    Telegram app2 = new Telegram();
    app.enviarMensagem();
    app2.enviarMensagem();
  }
}
