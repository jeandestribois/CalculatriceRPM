
public enum CalculatriceRPN {;
	public static void main(String... args)
	{
		SaisieRPN saisie = new SaisieRPN();
		while(saisie.getNext())
		{
			saisie.showOperandes();
		}
		System.out.println("Au revoir");
	}
}
