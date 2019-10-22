import java.util.Scanner;
import java.util.ArrayList;

public class SaisieRPN {
	
	private Scanner scan = new Scanner(System.in);
	private int compteur = 0;
	private MoteurRPN moteur = new MoteurRPN();
	
	SaisieRPN()
	{
		System.out.println("Bonjour, veuillez saisir votre expression "
				+ "sous la forme RPN en validant par à chaque fois par la touche <entrée>");
	}
	
	public boolean getNext()
	{
		String s = this.scan.nextLine();
		try {
			Float.parseFloat(s);
		}
		catch (NumberFormatException e){
			if(s.equals("exit")) return false;
			else if (this.compteur >= 2)
			{
				char c = s.charAt(0);
				if(c=='+')	this.moteur.operation(Operation.PLUS);
				else if(c=='-')	this.moteur.operation(Operation.MOINS);
				else if(c=='*')	this.moteur.operation(Operation.MULT);
				else if(c=='/') this.moteur.operation(Operation.DIV);
				else {
					System.err.println("Erreur : l'argument renseigné n'est pas valide");
					System.exit(1);
				}
				return true;
			}
			else {
				System.err.println("Erreur : le nombre d'opérandes est insuffisant");
				System.exit(1);
			}
		}
		this.compteur++;
		this.moteur.nouvelleOperande(Float.valueOf(s));
		return true;
	}
	
	public void showOperandes()
	{
		ArrayList<Float> l = this.moteur.getOperandes();
		for(int i=0; i<l.size(); i++) System.out.println(l.get(i));
	}
}
