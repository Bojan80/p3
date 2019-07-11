package p3;

import java.util.Random;
import javax.swing.JPanel;

public class SSPPlayer extends JPanel{
	Random rand = new Random();
	private int randNbr;
		
	public int getGenerateNbr(){
		randNbr = rand.nextInt(3) + 1; // slumptal genereras
		return randNbr; // returnerar slumpvalet
	}
}