package io.github.oo2;

public class Papel implements Juego {

	@Override
	public String jugarContra(Juego juego) {
		return juego.jugarContraPapel();
	}

	@Override
	public String jugarContraPiedra() {
		return "gana Papel";
	}

	@Override
	public String jugarContraPapel() {
		return "empate";
	}

	@Override
	public String jugarContraTijera() {
		return "gana Tijera";
	}

	@Override
	public String jugarContraSpock() {
		return "gana Papel";
	}

	@Override
	public String jugarContraLagarto() {
		return "gana Lagarto";
	}

}
