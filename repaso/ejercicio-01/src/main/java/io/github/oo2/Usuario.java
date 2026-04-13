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

  public List<Publicacion> getPublicaciones() {
    return this.publicaciones;
  }

  private boolean cumpleLongitud(String texto) {
    return (texto.length() >= 1 && texto.length() <= 10);
  }

  public void eliminarPublicaciones() {
    this.publicaciones.clear();
  }

  public void eliminarTweets() {
    for (Publicacion publicacion : publicaciones) {
      if (!publicacion.esRetweet()) {
        this.publicaciones.remove(publicacion);
      }
    }
  }

  public boolean publicarTweet(String texto) {
    boolean ok = false;
    if (this.cumpleLongitud(texto)) {
      Tweet tweet = new Tweet(texto);
      this.publicaciones.add(tweet);
      ok = true;
    }
    return ok;
  }

  public void retweetear(Tweet tweet) {
    Publicacion retweet = new Retweet(tweet);
    this.publicaciones.add(retweet);
  }
}
