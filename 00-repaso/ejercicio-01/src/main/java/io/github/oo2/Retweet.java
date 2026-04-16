package io.github.oo2;

public class Retweet implements Publicacion {
  Tweet tweet;

  public Retweet(Tweet tweet) {
    this.tweet = tweet;
  }

  @Override
  public boolean esRetweet() {
    return true;
  }

  @Override
  public String getTexto() {
    return tweet.getTexto();
  }
}
