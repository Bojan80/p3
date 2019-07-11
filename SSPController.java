package p3;

import java.util.Random;
import javax.swing.JPanel;

public class SSPController extends JPanel{
	// instansvariabler deklareras
	private SSPViewer viewer;
	private SSPPlayer player;
	Random rand = new Random();
	int computerCounter = 0; // initiering
	int humanCounter = 0; // initiering
		
	public SSPController(SSPPlayer player, SSPViewer viewer) { // konstruktor med två objekt som argument
		this.viewer = viewer;
		this.player = player;
	}
	public void play(int y) {
		int x = player.getGenerateNbr(); // x tilldelas värdet av från playerklassen och metoden getGenerateNbr()..detta är datorns val
		viewer.human(y);
		viewer.computer(x);
		
		switch(y) {
		// i de olika casen kollas spelarens olika val och jämför ifall spelaren eller datorn vunnit eller förlorat omgången
		case 1: 
			if (x == 2) { 
				humanCounter++;
				viewer.humanScore(humanCounter);
				}
			else if (x == 3) {
				computerCounter++;
				viewer.computerScore(computerCounter);
			} 
			if (humanCounter == 3) {
				viewer.pointHum();
			}
			else if (computerCounter == 3) {
				viewer.pointComp();
			}
			break;
		case 2:
			if (x == 1) {
				computerCounter++;
				viewer.computerScore(computerCounter);
			} 
			else if (x == 3) {
				humanCounter++;
				viewer.humanScore(humanCounter);
			}
			if (humanCounter == 3) {
				viewer.pointHum();
			}
 			else if (computerCounter == 3) {
 				viewer.pointComp();
 			}
			break;
		case 3:
			if (x == 1) {
				humanCounter++;
				viewer.humanScore(humanCounter);
			}
			else if (x == 2) {
				computerCounter++;
				viewer.computerScore(computerCounter);
			}
			if (humanCounter == 3) {
				viewer.pointHum();
			}
			else if (computerCounter == 3) {
				viewer.pointComp();
			}
			break;
		default: break;
		}
	}
	public void finish() { // vid tryck på finishknappen avslutas spelet
		System.exit(0);
	}
	public void newGame() { // metoden gör att räknarna nollställs
		humanCounter = 0;
		computerCounter = 0;
		viewer.newGame(); // metoden newGame kallas från klassen viewer
	}
	public boolean endOfGame() {
		if (humanCounter == 3 || computerCounter == 3) { // spelet avslutas när någon av räknarna når tre
			return true;
		}
		return false;
	}
}
	

