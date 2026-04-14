package io.github.oo2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	Twitter redSocial;

	@BeforeEach
	void setUp() throws Exception {
		redSocial = new Twitter();
		redSocial.crearUsuario("carlos");
		redSocial.crearUsuario("mariano");
	}

	@Test
	public void testCrearUsuario() {
		redSocial.crearUsuario("pedro");
		redSocial.crearUsuario("esteban");
		assertEquals(redSocial.getUsuarios().size(), 4);
		redSocial.crearUsuario("mariano");
		assertNotEquals(redSocial.getUsuarios().size(), 5);
		assertEquals(redSocial.getUsuarios().size(), 4);
	}

	@Test
	public void testEliminarUsuario() {
		redSocial.eliminarUsuario("carlos");
		assertEquals(redSocial.getUsuarios().size(), 1);
		assertFalse(redSocial.eliminarUsuario("pepe"));
		assertTrue(redSocial.eliminarUsuario("mariano"));
	}
}
