import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyFrame extends JFrame implements MouseListener {
	public MyFrame() {
		addMouseListener(this);
		setSize(300, 300 );
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void mouseClicked(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.ORANGE);
		g.fillOval(e.getX()-30, e.getY()-30, 60, 60);
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	
	public static void main(String[] args ) {
		MyFrame f = new MyFrame();
	}
}
