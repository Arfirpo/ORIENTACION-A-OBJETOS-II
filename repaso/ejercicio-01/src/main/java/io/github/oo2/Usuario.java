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

  public void setScreenName(String nombre){
    this.screenName = nombre;
  }

  public String getScreenName() {
    return this.screenName;
  }
}
