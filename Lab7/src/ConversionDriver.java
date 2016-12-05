import javax.swing.JFrame;


public class ConversionDriver 
{
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Temperature Converter");
		Conversion demo = new Conversion();
		
		frame.getContentPane().add(demo.getContent());
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		createAndDisplayGUI();
	}
}