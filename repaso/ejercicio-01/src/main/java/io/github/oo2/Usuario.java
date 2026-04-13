package io.github.oo2;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private String screenName;
  private List<Publicacion> publicaciones;

  public Usuario(String nombre) {
    this.setScreenName(nombre);
    this.publicaciones = new ArrayList<Publicacion>();
  }

  public void setScreenName(String nombre) {
    this.screenName = nombre;
  }

  public String getScreenName() {
    return this.screenName;
  }

  public boolean cumpleLongitud(String texto) {
    return (texto.length() >= 1 && texto.length() <= 280);
  }

  public void eliminarPublicaciones() {
    this.publicaciones.clear();
  }

  public void publicarTweet(String texto) {
    Tweet tweet = null;
    if (this.cumpleLongitud(texto)) {
      tweet = new Tweet(texto);
      this.publicaciones.add(tweet);
    }
  }

  public void retweetear(Tweet tweet){
    Retweet retweet = new Retweet(tweet);
    this.publicaciones.add(retweet);
  }
}
