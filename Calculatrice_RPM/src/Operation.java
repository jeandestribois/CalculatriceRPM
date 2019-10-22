
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
		@Override public float eval(float x, float y) {
			float z = 0;
			try {
				z = x / y;
			}
			catch(ArithmeticException e) {
				System.err.println("Erreur : Division par 0 impossible");
				System.exit(1);
			}
			return z; 
		}
	};

	
	private char symbole = ' ';
	
	Operation(char symbole) {
		this.symbole=symbole;
	}
	
	public char getSymbole() { return this.symbole; }
	
	public abstract float eval(float x, float y);
}
