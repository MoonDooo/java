import java.awt.*;
import javax.swing.*;
public class MyFrame extends JFrame{
	public MyFrame() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.orange);
		
		JButton b1 = new JButton("Button 1");
		b1.setBackground(Color.yellow);
		
		JButton b2 = new JButton("Button 2");
		b2.setBackground(Color.green);
		
		panel.add(b1);
		panel.add(b2);
		add(panel);
		
		setSize(300, 150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String argv[]) {
	2	MyFrame f = new MyFrame();
	}
}

