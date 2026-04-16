package src.main.java.io.github.oo2;

public class Lagarto implements Juego {

@Override
public String jugarContra(Juego juego) {
	return juego.jugarContraLagarto();
}

	@Override
	public String jugarContraPapel() {
		return "gana Lagarto";
	}

	@Override
	public String jugarContraPiedra() {
		return "gana Piedra";
	}

	@Override
	public String jugarContraTijera() {
		return "gana Tijera";
	}

	@Override
	public String jugarContraLagarto() {
		return "empate";
	}

	@Override
	public String jugarContraSpock() {
		return "gana Lagarto";
	}
}
