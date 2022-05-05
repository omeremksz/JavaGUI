package checkBoxes;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	JCheckBox checkBox;
	ImageIcon icon;
	ImageIcon checkIcon;
	
	public MyFrame() {
		
		icon = new ImageIcon("bicon64.png");//Create icon.
		checkIcon = new ImageIcon("emoji.jpg");//Create icon.
		
		button = new JButton();//Create button.
		button.setText("Submit");//Add some text to button.
		button.addActionListener(this);//Add action to button.
		button.setFocusable(false);//Get rid of the annoying border from button.
		
		checkBox = new JCheckBox();//Create checkbox.
		//Other way to add text to frame.//
		/*JTextField textField = new JTextField();
		textField.setText("I'm not a robot.");*/
		checkBox.setText("I'm not a robot.");//Set some text to checkbox.
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas",Font.PLAIN,28));
		checkBox.setIcon(icon);
		checkBox.setSelectedIcon(checkIcon);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(checkBox);
		this.add(button);
		//this.add(textField);//Other way to add text to frame.
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println(checkBox.isSelected());;
		}
		
	}
}
