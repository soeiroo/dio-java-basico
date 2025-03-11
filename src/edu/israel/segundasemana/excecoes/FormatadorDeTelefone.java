package edu.israel.segundasemana.excecoes;

public class FormatadorDeTelefone {
  static String formatarTelefone (String telefone) throws InvalidCellphoneNumberException {
    if (telefone.length() != 11) {
      throw new InvalidCellphoneNumberException();
    } else {
      return "(" + telefone.substring(0, 2) + ") " + telefone.substring(2, 7) + "-" + telefone.substring(7);
    }

  }

  public static void main(String[] args) {
    String telefone = "88988943823";
    try {
      System.out.println(formatarTelefone(telefone));
    } catch (InvalidCellphoneNumberException e) {
      e.printStackTrace();
    }
  }
}
