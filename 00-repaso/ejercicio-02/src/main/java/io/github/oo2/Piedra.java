package src.main.java.io.github.oo2;

public class Piedra implements Juego {

	@Override
	public String jugarContra(Juego juego) {
		return juego.jugarContraPiedra();
	}

	@Override
	public String jugarContraPapel() {
		return "gana papel";
	}

	@Override
	public String jugarContraPiedra() {
		return "empate";
	}

	@Override
	public String jugarContraTijera() {
		return "gana Piedra";
	}

	@Override
	public String jugarContraLagarto() {
		return "gana piedra";
	}

	@Override
	public String jugarContraSpock() {
		return "gana Spock";
	}
}
