import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.Random;

public class Dice 
{
	private JPanel panel;
	private JButton button;
	private JTextField text;
	private JLabel label;
	private Random r;
	
	public Dice()
	{
		panel = new JPanel();
		button = new JButton("Roll");
		text = new JTextField(3);//3 columns
		label = new JLabel("Enter a dice side number");
		
		//Load the listener
		button.addActionListener(buttonListener());	
		
		//load the panel
		panel.add(text);
		panel.add(button);
		panel.add(label);
	}
	
	public Component getContent()
	{
		return (panel);
	}
	
	private ActionListener buttonListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				r = new Random();
				String input = text.getText();
				int sides = Integer.parseInt(input);//convert String to integer
				int random = r.nextInt(sides) + 1;//roll between 1 and dice maximum
				String newText = "d" + sides + " Roll: " + random;//right results
				label.setText(newText);
				System.out.println(newText);
			}
		};
		
		return listener;
	}	
}