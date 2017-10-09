package problem1;

import javax.swing.JFrame;

public class Red_light {
	public  Red_light ()
		{
		JFrame frame = new JFrame();
		frame.setSize(1000, 600);
		frame.setTitle("Traffic_light");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		Ellipse_red_component component = new Ellipse_red_component();
	    frame.add(component);
		}

}
