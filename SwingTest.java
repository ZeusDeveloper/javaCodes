import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
/*  <Applet code = "SwingTest" width = "500" height = "500">
 *  </Applet>
*/ 
public class SwingTest extends JApplet implements ActionListener
{
	JTextField jtf;
	public void init()
	{
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		ImageIcon i = new ImageIcon("funny.gif");
		JButton jb = new JButton(i);
		jb.setActionCommand("Funny");
		jb.addActionListener(this);
		contentPane.add(jb);
		jtf = new JTextField(15);
		contentPane.add(jtf);
	}
	public void actionPerformed(ActionEvent ae)
	{
		jtf.setText(ae.getActionCommand());
	}
}
