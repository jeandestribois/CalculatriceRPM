package main;

import main.OperationException;

public enum Operation {
	PLUS('+') {
		@Override public float eval(float x, float y) { return x + y; }
	},
	MOINS('-') {
		@Override public float eval(float x, float y) { return x - y; }
	},
	MULT('*') {
		@Override public float eval(float x, float y) { return x * y; }
	},
	DIV('/') {
		@Override public float eval(float x, float y) throws OperationException {
			if(y == 0)
			{
				throw new OperationException("Erreur : division par 0 impossible");
			}
			return x/y;
		}
	};

	
	private char symbole = ' ';
	
	Operation(char symbole) {
		this.symbole=symbole;
	}
	
	public char getSymbole() { return this.symbole; }
	
	public abstract float eval(float x, float y) throws OperationException;
}
