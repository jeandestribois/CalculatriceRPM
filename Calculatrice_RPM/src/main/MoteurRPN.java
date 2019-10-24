package main;
import java.util.ArrayList;

public class MoteurRPN {
	
	private ArrayList<Float> operandes = new ArrayList<>();
	
	public MoteurRPN(){}
		
	public void nouvelleOperande(float x)
	{
		this.operandes.add(x);
	}
	
	public void operation(Operation op) throws OperationException
	{
		float x = this.operandes.get(this.operandes.size()-1);
		float y = this.operandes.get(this.operandes.size()-2);
		this.operandes.remove(this.operandes.size()-1);
		this.operandes.remove(this.operandes.size()-1);
		this.operandes.add(op.eval(x, y));
	}
	
	public ArrayList<Float> getOperandes()
	{
		return this.operandes;
	}
}
