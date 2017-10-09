package problem1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Ellipse_green_component extends JComponent {
	public static void paint_component(Graphics g)
	{// Construct a ellipse and draw it
		Graphics2D g2 = (Graphics2D)g;
		Ellipse2D.Double ellipse1 = new Ellipse2D.Double(0, -50,  20, 10);
		// Draw 1st ellipse
		g2.setColor(Color.black);
		g2.draw(ellipse1); 
		g2.fill(ellipse1);  
		Ellipse2D.Double ellipse2 = new Ellipse2D.Double(10, -50,  20, 10);
		// Draw 2rd ellipse
		g2.setColor(Color.black);
		g2.draw(ellipse2); 
		g2.fill(ellipse2);
		Ellipse2D.Double ellipse3 = new Ellipse2D.Double(20, -50,  30, 10);
		// Draw 2rd ellipse
		g2.setColor(Color.GREEN);
		g2.draw(ellipse3); 
		g2.fill(ellipse3);
				   
	}
}
