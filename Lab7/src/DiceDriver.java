import javax.swing.*;
import java.awt.Component;
import java.awt.event.*;

public class DiceDriver 
{
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Dice Roller");
		Dice diceRoll = new Dice();
		
		frame.getContentPane().add( diceRoll.getContent() );
		
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args)
	{
		createAndDisplayGUI();
	}
}