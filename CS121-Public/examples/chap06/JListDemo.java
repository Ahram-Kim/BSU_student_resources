import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * Demonstrates the use of a JList of Strings.
 * @author CS121 Instructors
 */
public class JListDemo
{
	/**
	 * Creates a JFrame and adds the main JPanel to the JFrame.
	 * @param args (unused)
	 */
	public static void main(String args[])
	{
		JFrame frame = new JFrame("JList Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new JListDemoPanel());
		frame.setPreferredSize(new Dimension(500, 400));
		frame.pack();
		frame.setVisible(true);
	}
}
