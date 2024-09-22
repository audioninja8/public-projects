package GameLoop;
import javax.swing.JFrame;

public class SimpleRPG{
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Simple RPG");
	    
          
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setResizable(false);
          frame.setTitle("2D Game");
          
          GamePanel gamePanel = new GamePanel();
          frame.add(gamePanel);
          
          frame.pack();
                
          frame.setLocationRelativeTo(null); // Center the frame
          frame.setVisible(true);
          gamePanel.startGameThread();
          gamePanel.requestFocus();
          
        
	}
}
