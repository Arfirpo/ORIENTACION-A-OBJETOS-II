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

	Usuario james;
	Tweet tweet;

	@BeforeEach
	void setUp() throws Exception {
		james = new Usuario("carlos");
		james.publicarTweet("hola bola");
		james.publicarTweet("churro con");
		tweet = new Tweet("cosa");
		james.retweetear(tweet);
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

		assertEquals(james.getPublicaciones().size(), 3);
		james.eliminarPublicaciones();
		assertEquals(james.getPublicaciones().size(), 0);
	}

	@Test
	public void testEliminarTweets() {
		assertEquals(james.getTweets().size(), 2);
		james.eliminarTweets();
		assertEquals(james.getTweets().size(), 0);
		assertEquals(james.getPublicaciones().size(), 1);
	}
}
