import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;

public class Conversion 
{
	private JPanel content;
	private JButton FCButton;
	private JButton FKButton;
	private JButton CKButton;
	private JButton CFButton;
	private JButton KFButton;
	private JButton KCButton;
	private JTextField text;
	private JLabel label;
	
	public Conversion()
	{
		content = new JPanel(new GridLayout(0,1));//Create with a grid layout of a single column
		FCButton = new JButton("F to C");
		FKButton = new JButton("F to K");
		CKButton = new JButton("C to K");
		CFButton = new JButton("C to F");
		KFButton = new JButton("K to F");
		KCButton = new JButton("K to C");
		text = new JTextField(3);//3 cols, not 20 chars
		label = new JLabel("Enter a temperature from F to C");
		
		//Load the listeners
		FCButton.addActionListener(FCListener());
		FKButton.addActionListener(FKListener());
		CKButton.addActionListener(CKListener());
		CFButton.addActionListener(CFListener());
		KFButton.addActionListener(KFListener());
		KCButton.addActionListener(KCListener());
		
		//load the panel
		content.add(text);
		content.add(label);
		content.add(FCButton);
		content.add(FKButton);
		content.add(CKButton);
		content.add(CFButton);
		content.add(KFButton);
		content.add(KCButton);
	}
	
	public Component getContent()
	{
		return (content);
	}
	
	//Fahrenheit to Celsius
	private ActionListener FCListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				double tempInF = Double.parseDouble(input);//convert String to double
				double tempInC = (tempInF-32)*(5.0/9.0); //convert F to C
				String newText = "Temp in C: " + String.format("%.2f",tempInC);//convert double to String and
											       //only display 2 places past decimal
				label.setText(newText);
				System.out.println(newText);
			}
		};
		
		return listener;
	}
	
	//Fahrenheit to Kelvin
	private ActionListener FKListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				double tempInF = Double.parseDouble(input);//convert String to double
				double tempInK = (tempInF-32)*(5.0/9.0)+(273.15); //convert F to K
				String newText = "Temp in K: " + String.format("%.2f",tempInK);//convert double to String and
											       //only display 2 places past decimal
				label.setText(newText);
				System.out.println(newText);
			}
		};
		
		return listener;
	}
	
	//Celsius to Kelvin
	private ActionListener CKListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				double tempInC = Double.parseDouble(input);//convert String to double
				double tempInK = (tempInC)+(273.15); //convert C to K
				String newText = "Temp in K: " + String.format("%.2f",tempInK);//convert double to String and
											       //only display 2 places past decimal
				label.setText(newText);
				System.out.println(newText);
			}
		};
		
		return listener;
	}
	
	//Celsius to Fahrenheit
	private ActionListener CFListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				double tempInC = Double.parseDouble(input);//convert String to double
				double tempInF = (tempInC*(9.0/5.0))+(32); //convert C to F
				String newText = "Temp in F: " + String.format("%.2f",tempInF);//convert double to String and
											       //only display 2 places past decimal
				label.setText(newText);
				System.out.println(newText);
			}
		};
		
		return listener;
	}
	
	//Kelvin to Fahrenheit
	private ActionListener KFListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				double tempInK = Double.parseDouble(input);//convert String to double
				double tempInF = (tempInK-273.15)*(5.0/9.0)+(32); //convert K to F
				String newText = "Temp in F: " + String.format("%.2f",tempInF);//convert double to String and
											       //only display 2 places past decimal
				label.setText(newText);
				System.out.println(newText);
			}
		};
		
		return listener;
	}
	
	//Kelvin to Celsius
	private ActionListener KCListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				double tempInK = Double.parseDouble(input);//convert String to double
				double tempInC = (tempInK)-(273.15); //convert K to C
				String newText = "Temp in C: " + String.format("%.2f",tempInC);//convert double to String and
											       //only display 2 places past decimal
				label.setText(newText);
				System.out.println(newText);
			}
		};
		
		return listener;
	}
}