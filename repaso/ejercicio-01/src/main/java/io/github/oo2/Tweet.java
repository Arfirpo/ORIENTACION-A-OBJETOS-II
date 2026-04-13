package io.github.oo2;

public class Tweet implements Publicacion {
  private String texto;

  public Tweet(String texto) {
    this.setTexto(texto);
  }

  public void setTexto(String texto) {
    this.texto = texto;
  }

  @Override
  public String getTexto() {
    return this.texto;
  }

  @Override
  public boolean esRetweet() {
    return false;
  }





}
