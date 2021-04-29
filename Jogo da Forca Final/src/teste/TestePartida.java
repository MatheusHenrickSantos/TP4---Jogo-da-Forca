package teste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import modelo.Partida;

class TestePartida {
	Partida partida = new Partida();
	
	@Test
	void testGetPalavraLabel() {
		partida.getPalavraLabel().setText("PALAVRA");
		assertEquals("PALAVRA", partida.getPalavraLabel().getText());
	}
}
