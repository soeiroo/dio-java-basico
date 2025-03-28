package edu.israel.terceirasemana.herança_polimorfismo;

public class Gerente extends Funcionario {
  public Gerente(String nome, String email, String senha) {
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    this.admin = true;
  }

  public String gerarRelatorioFinanceiro() {
    return "Relatório financeiro gerado";
  }

  public String consultarVendas() {
    return "Vendas consultadas";
  }

  public String alterarDados(){
    return "Dados alterados";
  }
}
