package io.github.oo2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase
 * 
 */
public class UsuarioTest {

	Usuario james, guido;

	@BeforeEach
	void setUp() throws Exception {
		james = new Usuario("carlos");
	}

	@Test
	public void testPublicarTweet() {
		assertFalse(james.publicarTweet("")); // cero de longitud
		assertTrue(james.publicarTweet("A")); // longitud 1
		assertTrue(james.publicarTweet("hola mundo")); // longitud 10
		assertFalse(james.publicarTweet("hola mundo!")); // longitud 11
	}

	@Test
	public void testEliminarPublicaciones() {
		james.publicarTweet("hola bola");
		james.publicarTweet("churro con");
		Tweet tweet = new Tweet("perro");
		assertEquals(james.getPublicaciones().size(), 2);
		james.retweetear(tweet);
		assertEquals(james.getPublicaciones().size(), 3);
		james.eliminarTweets();
		assertEquals(james.getPublicaciones().size(), 2);
		james.eliminarPublicaciones();
		assertEquals(james.getPublicaciones().size(), 0);

	}
}
