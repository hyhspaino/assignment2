package problem1;

import javax.swing.JFrame;

public class Green_light {
	public Green_light()
		{
		JFrame frame = new JFrame();
		frame.setSize(1000, 600);
		frame.setTitle("Traffic_light");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		Ellipse_green_component component = new Ellipse_green_component();
	    frame.add(component);
		}

}
