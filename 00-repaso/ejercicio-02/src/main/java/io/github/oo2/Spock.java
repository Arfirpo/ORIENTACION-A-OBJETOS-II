package io.github.oo2;

public class Spock implements Juego {

	@Override
	public String jugarContra(Juego juego) {
		return juego.jugarContraSpock();
	}

	@Override
	public String jugarContraLagarto() {
		return "gana Lagarto";
	}

	@Override
	public String jugarContraSpock() {
		return "empate";
	}

	@Override
	public String jugarContraPapel() {
		return "gana Papel";
	}

	@Override
	public String jugarContraPiedra() {
		return "gana Spock";
	}

	@Override
	public String jugarContraTijera() {
		return "gana Spock";
	}
}