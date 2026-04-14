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

  public List<Usuario> getUsuarios() {
    return this.usuarios;
  }

  private boolean usuarioExiste(String screenName) {
    return this.usuarios.stream().anyMatch(u -> u.getScreenName().equals(screenName));
  }

  public boolean eliminarUsuario(String screenName) {
    boolean ok = false;
    if (usuarioExiste(screenName)) {
      this.usuarios.removeIf(u -> u.getScreenName().equals(screenName));
      ok = true;
    }
    return ok;
  }

}
