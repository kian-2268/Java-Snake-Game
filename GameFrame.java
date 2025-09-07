package snakeGame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GameFrame extends JFrame{
	
	 HomePanel homePanel;
	 GamePanel gamePanel;
	
	GameFrame(){
		
		homePanel = new HomePanel(this);
		this.setTitle("Snake Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setContentPane(homePanel);
		this.pack(); //fits all components to the frame
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	public void startGame() {
		gamePanel = new GamePanel();
		this.setContentPane(gamePanel);
		this.revalidate();
		gamePanel.requestFocusInWindow();
	}
	public void howToPlay() {
		JOptionPane.showMessageDialog(this, "How to play Snake Game?\n "
				+ "1. Use W/A/S/D to move the snake up, left, down, and right.\n"
				+ "2. Eat the apples to grow!"
				+ "3. Don't hit the walls or yourself!\n"
				+ "ps. more rules will be added for the future updates! Stay tuned!");
	}
	public void scoreBoard() {
		JOptionPane.showMessageDialog(this, "Scoreboard feature is not implemented yet.");
	}

}
