import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.io.*;

public class Voting 
{
	private JPanel content;
	private JTextField fname;
	private JTextField lname;
	private JLabel fnlabel;
	private JLabel lnlabel;
	private JRadioButton AthosButton;
	private JRadioButton PorthosButton;
	private JRadioButton AramisButton;
	private JRadioButton DArtagnanButton;
	private PrintWriter out;
	
	public Voting()
	{
		content = new JPanel(new GridLayout(0,1));//Create with a grid layout of a single column
		fname = new JTextField();
		lname = new JTextField();
		fnlabel = new JLabel("Enter your first name:");
		lnlabel = new JLabel("Enter your last name:");
		
		//button group
		ButtonGroup group = new ButtonGroup();
		AthosButton = new JRadioButton("Athos");
		group.add(AthosButton);
		PorthosButton = new JRadioButton("Porthos");
		group.add(PorthosButton);
		AramisButton = new JRadioButton("Aramis");
		group.add(AramisButton);
		DArtagnanButton = new JRadioButton("D'Artagnan");
		group.add(DArtagnanButton);
		
		//Load the listeners
		AthosButton.addActionListener(Athos());
		PorthosButton.addActionListener(Porthos());
		AramisButton.addActionListener(Aramis());
		DArtagnanButton.addActionListener(DArtagnan());
		
		//load the panel
		content.add(fnlabel);
		content.add(fname);
		content.add(lnlabel);
		content.add(lname);
		content.add(AthosButton);
		content.add(PorthosButton);
		content.add(AramisButton);
		content.add(DArtagnanButton);
	}
	
	public Component getContent()
	{
		return (content);
	}
	
	private ActionListener Athos() {
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					out = new PrintWriter(new FileWriter("athos.txt", true));
					String first = fname.getText();
					String last = lname.getText();
					String name = first + " " + last;
					out.println(name);
					out.close();
				}catch(IOException err){
					System.err.println("IOException: " + err.getMessage());
				}
			}
		};
		
		return listener;
	}
	
	private ActionListener Porthos() {
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					out = new PrintWriter(new FileWriter("porthos.txt", true));
					String first = fname.getText();
					String last = lname.getText();
					String name = first + " " + last;
					out.println(name);
					out.close();
				}catch(IOException err){
					System.err.println("IOException: " + err.getMessage());
				}
			}
		};
		
		return listener;
	}
	
	private ActionListener Aramis() {
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					out = new PrintWriter(new FileWriter("aramis.txt", true));
					String first = fname.getText();
					String last = lname.getText();
					String name = first + " " + last;
					out.println(name);
					out.close();
				}catch(IOException err){
					System.err.println("IOException: " + err.getMessage());
				}
			}
		};
		
		return listener;
	}
	
	private ActionListener DArtagnan() {
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					out = new PrintWriter(new FileWriter("dArtagnan.txt", true));
					String first = fname.getText();
					String last = lname.getText();
					String name = first + " " + last;
					out.println(name);
					out.close();
				}catch(IOException err){
					System.err.println("IOException: " + err.getMessage());
				}
			}
		};
		
		return listener;
	}
}