package singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LogManager2Test {

	@Test
	void deveSerInstanciaUnica() {
		LogManager2 instance1 = LogManager2.getInstance();
		assertNotNull(instance1);
		
		LogManager2 instance2 = LogManager2.getInstance();
		assertEquals(instance1, instance2);
	}

}
