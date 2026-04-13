package io.github.oo2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    return (texto.length() >= 1 && texto.length() <= 280);
  }

  public void eliminarPublicaciones() {
    this.publicaciones.clear();
  }

  public void eliminarTweets() {
    List<Publicacion> tweets = this.publicaciones.stream().filter(p -> !p.esRetweet()).collect(Collectors.toList());
    tweets.clear();
  }

  public boolean publicarTweet(String texto) {
    Tweet tweet = null;
    boolean ok = false;
    if (this.cumpleLongitud(texto)) {
      tweet = new Tweet(texto);
      this.publicaciones.add(tweet);
      ok = true;
    }
    return ok;
  }

  public void retweetear(Tweet tweet) {
    Retweet retweet = new Retweet(tweet);
    this.publicaciones.add(retweet);
  }
}
