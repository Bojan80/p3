package p3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SSPViewer extends JPanel {
	private JLabel lblTitle = new JLabel("Först till tre vinner!");
	private JLabel lblHuman = new JLabel("Human");
	private JLabel lblComputer = new JLabel("Computer");
	private JLabel lblResHuman = new JLabel("0");
	private JLabel lblResComputer = new JLabel("0");
	private JLabel lblChoice1 = new JLabel();
	private JLabel lblChoice2 = new JLabel();
	private int humanCounter = 0;
	private int computerCounter = 0;
			
	public SSPViewer() {
		// spelfältet byggs upp
		setPreferredSize(new Dimension(260, 130)); 
		setLayout(null);
		lblTitle.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblHuman.setFont(new Font("SansSerif", Font.BOLD, 14));
		lblComputer.setFont(new Font("SansSerif", Font.BOLD, 14));   
		lblChoice1.setFont(new Font("SansSerif", Font.ITALIC, 12));  
		lblChoice2.setFont(new Font("SansSerif", Font.ITALIC, 12));
		lblTitle.setBounds(40, 20, 240, 17);
		lblChoice1.setBounds(60, 50, 240, 17);
		lblHuman.setBounds(40, 50, 240, 17);
		lblComputer.setBounds(150,50,240, 17);
		lblResHuman.setBounds(60, 80, 240, 17);
		lblResComputer.setBounds(180, 80, 240, 17);
		lblChoice1.setBounds(45, 110, 240, 17);
		lblChoice2.setBounds(170, 110, 240, 17);
		// de olika lbl läggs till		 
		add(lblTitle);
		add(lblHuman);
		add(lblComputer);
		add(lblResHuman);
		add(lblResComputer);
		add(lblChoice1);
		add(lblChoice2);
	}
	public void pointHum() {
		lblTitle.setText("Du har vunnit!");
	}
	public void pointComp() {
		lblTitle.setText("Datorn har vunnit!");
	}
	public void human(int y) { 
		switch(y) {  
		case 1: 
			lblChoice1.setText("STEN"); // vid tryck på sten läggs texten för sten till
			break;
		case 2: 
			lblChoice1.setText("SAX"); // vid tryck på sax läggs texten för sax till
			break;
		case 3: 
			lblChoice1.setText("PÅSE"); // vid tryck på på se läggs texten för påse till
			break;
		default: break;
		}
	}
	public void computer(int x) {
		switch(x) {
		case 1: 
			lblChoice2.setText("STEN");
			break;
		case 2: 
			lblChoice2.setText("SAX");
			break;
		case 3: lblChoice2.setText("PÅSE");
			break;
		default: 
			break;
		}
	}
	// resultaten för spelarna uppdateras
	public void humanScore(int x) {
		lblResHuman.setText(Integer.toString(x));
	}
	public void computerScore(int x) {
		lblResComputer.setText(Integer.toString(x));
	}
	// metod som startar nytt spel
	public void newGame() {
		String newTitle = "Först till tre vinner!";
		String noTxt1 = "";
		String noTxt2 = "";
		lblChoice1.setText(noTxt1);
	    lblChoice2.setText(noTxt2);
	    lblResHuman.setText("" + humanCounter);
	    lblResComputer.setText("" + computerCounter);
	    lblTitle.setText(newTitle);
	}
}