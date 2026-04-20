package io.github.oo2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JuegoTest {
	private Juego papel;
	private Juego piedra;
	private Juego tijera;
	private Juego spock;
	private Juego lagarto;

	@BeforeEach
	void setUp() throws Exception{
		papel = new Papel();
		piedra = new Piedra();
		tijera = new Tijera();
		spock = new Spock();
		lagarto = new Lagarto();
	}

	@Test
	public void testJuego(){
		assertEquals(papel.jugarContra(lagarto), "gana Lagarto");
		assertEquals(piedra.jugarContra(spock), "gana Spock");
		assertEquals(tijera.jugarContra(papel), "gana Tijera");
		assertEquals(spock.jugarContra(lagarto), "gana Lagarto");
		assertEquals(lagarto.jugarContra(piedra), "gana Piedra");
	}

}
