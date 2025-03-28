package edu.israel.terceirasemana.herança_polimorfismo;

public abstract class Funcionario {
  protected String nome;
  protected String email;
  protected String senha;
  protected boolean admin;

  public String getNome() {
    return this.nome;
  }

  public String getAdmin() {
    return this.admin ? "Sim" : "Não";
  }

  public String realizarLogin(
                              String email,
                              String senha) {
    return "Login realizado";
  }

  public String realizarLogout(){
    return "Logout realizado";
  }

  public String alterarSenha(){
    return "Senha alterada";
  }
}
