package main;
import java.util.Scanner;
import java.util.ArrayList; 

public class SaisieRPN {
	final float MAX_VALUE = 100000000;
	final float MIN_VALUE = (float) 0.0000001;
	
	private Scanner scan = new Scanner(System.in);
	private MoteurRPN moteur = new MoteurRPN();
	
	SaisieRPN()
	{
		System.out.println("Bonjour, veuillez saisir votre expression "
				+ "sous la forme RPN en validant par à chaque fois par la touche <entrée>");
	}
	
	public boolean getNext() throws OperationException
	{
		String s = this.scan.nextLine();
		try {
			Float.parseFloat(s);
		}
		catch (NumberFormatException e){
			if(s.equals("exit")) return false;
			else if(this.moteur.getOperandes().size() < 2) {
				throw new OperationException("Erreur : nombre d'operandes insuffisant");
			}
			else
			{
				char c = s.charAt(0);
				if(c=='+')	this.moteur.operation(Operation.PLUS);
				else if(c=='-')	this.moteur.operation(Operation.MOINS);
				else if(c=='*')	this.moteur.operation(Operation.MULT);
				else if(c=='/') this.moteur.operation(Operation.DIV);
				else {
					throw new OperationException("Erreur : l'argument renseigné n'est pas valide");
				}
				return true;
			}
		}
		float operande = Float.valueOf(s);
		if(Math.abs(operande) < this.MIN_VALUE || Math.abs(operande) > MAX_VALUE) {
			throw new OperationException("La valeur entrée en argument est en dehors de l'interval accepté");
		}
		this.moteur.nouvelleOperande(Float.valueOf(s));
		return true;
	}
	
	public void showOperandes()
	{
		ArrayList<Float> l = this.moteur.getOperandes();
		for(int i=0; i<l.size(); i++) System.out.println(l.get(i));
	}
}
