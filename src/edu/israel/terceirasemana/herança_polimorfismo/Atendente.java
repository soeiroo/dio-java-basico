package edu.israel.terceirasemana.herança_polimorfismo;

public class Atendente extends Funcionario{
  public Atendente(String nome, String email, String senha) {
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    this.admin = false;
  }

  public String receberPagamento(){
    return "Pagamento recebido";
  }

  public String fecharCaixa(){
    return "Caixa fechado";
  }



}
