package edu.israel.segundasemana.poo.aprendendo_enums;

enum EstadosBrasileiro {
  SAO_PAULO ("SP", "São Paulo"),
  RIO_DE_JANEIRO ("RJ", "Rio de Janeiro"),
  MINAS_GERAIS ("MG", "Minas Gerais"),
  BAHIA ("BA", "Bahia"),
  RIO_GRANDE_DO_SUL ("RS", "Rio Grande do Sul"),
  CEARA ("CE", "Ceará")

  ;

  private String nome;
  private String sigla;

  private EstadosBrasileiro(String sigla, String nome) {
    this.sigla = sigla;
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public String getSigla() {
    return this.sigla;
  }

  public String getNomeMaiusculo(){
    return this.nome.toUpperCase();
  }
}
