package snakeGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomePanel extends JPanel implements ActionListener{
	
	JButton startButton, guideButton, sBButton;
	JLabel title;
	GridBagConstraints gbc;
	GameFrame parent;
	
	HomePanel (GameFrame parent) {
		
		this.parent = parent;
		this.setBackground(Color.black);
		this.setPreferredSize(new Dimension(600, 600));
		this.setLayout(new GridBagLayout());
		gbc = new GridBagConstraints();
		gbc.insets = new Insets (10, 0, 10, 0);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		title = new JLabel("Snake Game", SwingConstants.CENTER);
		title.setFont(new Font("Comic Sans MS", Font.BOLD, 48));
		title.setForeground(Color.green);
		gbc.gridx = 0;
		gbc.gridy = 0;
		this.add(title, gbc);
		
		startButton = new JButton("Start Game");
		startButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		startButton.addActionListener(this);
		startButton.setFocusPainted(false);
		gbc.gridy = 1;
		this.add(startButton, gbc);
		
		guideButton = new JButton("How To Play");
		guideButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		guideButton.addActionListener(this);
		gbc.gridy = 2;
		this.add(guideButton, gbc);
		
		sBButton = new JButton("Scoreboard");
		sBButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		sBButton.addActionListener(this);
		gbc.gridy = 3;
		this.add(sBButton, gbc);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == startButton) {
			parent.startGame();
		}
		else if(e.getSource() == guideButton) {
			parent.howToPlay();
		}
		else if(e.getSource() == sBButton) {
			parent.scoreBoard();
		}
		
	}
	
	

}
