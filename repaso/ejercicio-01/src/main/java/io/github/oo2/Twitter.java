package io.github.oo2;

import java.util.ArrayList;
import java.util.List;

public class Twitter {

  private List<Usuario> usuarios;

  public Twitter() {
    this.usuarios = new ArrayList<Usuario>();
  }

  public void crearUsuario(String screenName) {

    if (!usuarios.stream().anyMatch(user -> user.getScreenName().equals(screenName))) {
      Usuario user = new Usuario(screenName);
      this.usuarios.add(user);
    }
  }

}
