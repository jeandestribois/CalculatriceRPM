package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import main.MoteurRPN; 

class MoteurRPNTest {

	@Test
	void testNouvelleOperande() {
		MoteurRPN m = new MoteurRPN();
		
		float x = 5;
		float y = 6;
		ArrayList<Float> l = new ArrayList<>();
		l.add(x);
		l.add(y);
		m.nouvelleOperande(x);
		m.nouvelleOperande(y);
		assertEquals(l, m.getOperandes(), "insertion dans la liste d'operandes");
	}

}
