package teste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import lista.ListaDePalavras;

class testeLista {
	ListaDePalavras lista = new ListaDePalavras();
	
	@Test
	void testGetCidade() {
		assertEquals( "HONG KONG", lista.getCidade(0));
	}

}
