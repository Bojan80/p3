package p3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SSPUserInput extends JPanel implements ActionListener {
	private JButton btnRock = new JButton("Sten");
	private JButton btnScissors = new JButton("Sax");
	private JButton btnPaper = new JButton("Påse");
	private JButton btnNewGame = new JButton("Nytt spel");
	private JButton btnFinish = new JButton("Avsluta");
	private SSPController controller;
					
	public SSPUserInput(SSPController controller) {
		setPreferredSize( new Dimension(300, 150) );
		setBackground(Color.CYAN);
		this.controller = controller;
		btnRock.setPreferredSize(new Dimension(70, 30));
		btnScissors.setPreferredSize(new Dimension(70,30));
		btnPaper.setPreferredSize(new Dimension(70,30));
        btnNewGame.setPreferredSize(new Dimension(220,30));
		btnFinish.setPreferredSize(new Dimension(220, 30));
		// metoderna gör att knapparna aktiveras
		btnRock.addActionListener(this);	// Med argumentet "this" talar man om att lyssnaren är implementerade i den aktuella klassen, dvs. i samma klass som komponentreferensen btnExit. 
		btnScissors.addActionListener(this);
		btnPaper.addActionListener(this);
		btnNewGame.addActionListener(this);
		btnFinish.addActionListener(this);
		// knapparna adderas
		add(btnRock);
		add(btnScissors);
		add(btnPaper);
		add(btnNewGame);
		add(btnFinish);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnRock) { // vid tryck på knappen sten aktiveras metoden play från klassen controllen. 
			controller.play(1); // 1:an syftar till casen
			if (controller.endOfGame()) {
				disableButtons();
			}
		}
		else if(e.getSource() == btnScissors) {
			controller.play(2);
			if (controller.endOfGame()) {
				disableButtons();
			}
		}
		else if(e.getSource() == btnPaper) {
			controller.play(3);
			if (controller.endOfGame()) {
				disableButtons();
			}
		}
		else if(e.getSource() == btnNewGame) {
			enableButtons();
			controller.newGame();
		}
		if(e.getSource() == btnFinish){
			controller.finish();
		}
	}
	// knapparna avaktiveras
	public void disableButtons() { 
		btnRock.setEnabled(false);
		btnScissors.setEnabled(false);
		btnPaper.setEnabled(false);
	}
	//knapparna aktiveras
	public void enableButtons() {
		btnRock.setEnabled(true);
		btnScissors.setEnabled(true);
		btnPaper.setEnabled(true);
	}
}



