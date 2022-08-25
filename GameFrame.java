package Snake;
import javax.swing.JFrame;

public class GameFrame extends JFrame{

	GameFrame() {
		// TODO Auto-generated constructor stub



		this.add(new GamePanel());
		this.setTitle("My Snake Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);

	}

}
