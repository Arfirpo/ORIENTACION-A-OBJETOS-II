package io.github.oo2;

public class Tijera implements Juego {

	@Override
	public String jugarContra(Juego juego) {
		return juego.jugarContraTijera();
	}

	@Override
	public String jugarContraPiedra() {
		return "gana Piedra";
	}

	@Override
	public String jugarContraPapel() {
		return "gana Papel";
	}

	@Override
	public String jugarContraTijera() {
		return "empate";
	}

	@Override
	public String jugarContraSpock() {
		return "gana Spock";
	}

	@Override
	public String jugarContraLagarto() {
		return "gana Tijera";
	}
}