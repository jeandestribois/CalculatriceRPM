package main;

import exception.OperationException;

public enum CalculatriceRPN {;
	public static void main(String... args) throws OperationException
	{
		SaisieRPN saisie = new SaisieRPN();
		while(saisie.getNext())
		{
			saisie.showOperandes();
		}
		System.out.println("Au revoir");
	}
}
