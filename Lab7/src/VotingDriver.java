import javax.swing.JFrame;


public class VotingDriver 
{
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Voting System");
		Voting demo = new Voting();
		
		frame.getContentPane().add(demo.getContent());
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		createAndDisplayGUI();
	}
}