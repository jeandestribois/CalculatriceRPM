package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Operation;

import main.OperationException;

class OperationTest {

	@Test
	void testEvalPlus() throws OperationException {
		Operation op = Operation.PLUS;
		
		float x, y, z;
		
		x = 5;
		y = 7;
		z = x+y;
		assertTrue(op.eval(x, y) == z, "addition pour x et y positifs");
		
		x = -5;
		y = -7;
		z = x+y;
		assertTrue(op.eval(x, y) == z, "addition pour x et y negatifs");
		
		x = 0;
		y = 5;
		z = x+y;
		assertTrue(op.eval(x, y) == z, "addition pour x nul et y positifs");
		
		x = 0;
		y = 0;
		z = x+y;
		assertTrue(op.eval(x, y) == z, "addition pour x et y nuls");
		
		x = (float) 5.7;
		y = (float) 7.5;
		z = x+y;
		assertTrue(op.eval(x, y) == z, "addition pour x et y positifs à virgule");
		
		x = (float) -5.7;
		y = (float) -7.5;
		z = x+y;
		assertTrue(op.eval(x, y) == z, "addition pour x et y negatifs à virgule");
	}
	
	@Test
	void testEvalMoins() throws OperationException {
		Operation op = Operation.MOINS;
		
		float x, y, z;
		
		x = 5;
		y = 7;
		z = x-y;
		assertTrue(op.eval(x, y) == z, "soustraction pour x et y positifs");
		
		x = -5;
		y = -7;
		z = x-y;
		assertTrue(op.eval(x, y) == z, "soustraction pour x et y negatifs");
		
		x = 0;
		y = 5;
		z = x-y;
		assertTrue(op.eval(x, y) == z, "soustraction pour x nul et y positifs");
		
		x = 0;
		y = 0;
		z = x-y;
		assertTrue(op.eval(x, y) == z, "soustraction pour x et y nuls");
		
		x = (float) 5.7;
		y = (float) 7.5;
		z = x-y;
		assertTrue(op.eval(x, y) == z, "soustraction pour x et y positifs à virgule");
		
		x = (float) -5.7;
		y = (float) -7.5;
		z = x-y;
		assertTrue(op.eval(x, y) == z, "soustraction pour x et y negatifs à virgule");
	}
	
	@Test
	void testEvalMult() throws OperationException {
		Operation op = Operation.MULT;
		
		float x, y, z;
		
		x = 5;
		y = 7;
		z = x*y;
		assertTrue(op.eval(x, y) == z, "multiplication pour x et y positifs");
		
		x = -5;
		y = -7;
		z = x*y;
		assertTrue(op.eval(x, y) == z, "multiplication pour x et y negatifs");
		
		x = 0;
		y = 5;
		z = x*y;
		assertTrue(op.eval(x, y) == z, "multiplication pour x nul et y positifs");
		
		x = 0;
		y = 0;
		z = x*y;
		assertTrue(op.eval(x, y) == z, "multiplication pour x et y nuls");
		
		x = (float) 5.7;
		y = (float) 7.5;
		z = x*y;
		assertTrue(op.eval(x, y) == z, "multiplication pour x et y positifs à virgule");
		
		x = (float) -5.7;
		y = (float) -7.5;
		z = x*y;
		assertTrue(op.eval(x, y) == z, "multiplication pour x et y negatifs à virgule");
	}
	
	@Test
	void testEvalDiv() throws OperationException {
		Operation op = Operation.DIV;
		
		float x, y, z;
		
		x = 5;
		y = 7;
		z = x/y;
		assertTrue(op.eval(x, y) == z, "division pour x et y positifs");
		
		x = -5;
		y = -7;
		z = x/y;
		assertTrue(op.eval(x, y) == z, "division pour x et y negatifs");
		
		x = 0;
		y = 5;
		z = x/y;
		assertTrue(op.eval(x, y) == z, "division pour x nul et y positifs");
		
		x = (float) 5.7;
		y = (float) 7.5;
		z = x/y;
		assertTrue(op.eval(x, y) == z, "division pour x et y positifs à virgule");
		
		x = (float) -5.7;
		y = (float) -7.5;
		z = x/y;
		assertTrue(op.eval(x, y) == z, "division pour x et y negatifs à virgule");
	}
	
	@Test
	void testEvalDiv0() {
		float x = 5;
		float y = 0;
		Operation op = Operation.DIV;
		assertThrows(OperationException.class, () -> {op.eval(x, y);}, "Exception non déclenché pour la division par 0");
	}
}
