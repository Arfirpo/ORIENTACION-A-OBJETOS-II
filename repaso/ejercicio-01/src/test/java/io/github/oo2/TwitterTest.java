package io.github.oo2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class TwitterTest {
	
	Usuario james, guido;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new Usuario("carlos");
		guido = new Usuario("pedro");
	}
	
    // @Test
    // public void testNombreCompleto() {
    //     assertEquals("Gosling, James", james.getNombreCompleto());
    //     assertEquals("van Rossum, Guido", guido.getNombreCompleto());
    // }
}
