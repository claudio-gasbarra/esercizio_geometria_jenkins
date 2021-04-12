package geometria;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreeTest {

	@Test
	public void testTriangolo() {
		int base = 10;
		int alt = 4;
		int valoreAtteso = 20;
		int valoreCalcolato = Aree.triangolo(base, alt);
		assertEquals(valoreAtteso, valoreCalcolato);
	}

	@Test
	public void testQuadrato() {
		int lato = 5;
		int valoreAtteso = 25;
		int valoreCalcolato = Aree.quadrato(lato);
		assertEquals(valoreAtteso, valoreCalcolato);
	}

	@Test
	public void testRombo() {
		int dmag = 8;
		int dmin = 6;
		int valoreAtteso = 24;
		int valoreCalcolato = Aree.rombo(dmag, dmin);
		assertEquals(valoreAtteso, valoreCalcolato);
	}

}
