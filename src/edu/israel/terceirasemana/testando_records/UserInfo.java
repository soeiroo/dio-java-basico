package edu.israel.terceirasemana.testando_records;

public record UserInfo(String name) {
  public UserInfo {
    if (name == null || name.isBlank()) {
      throw new IllegalArgumentException("Name cannot be null");
    }
  }

}
