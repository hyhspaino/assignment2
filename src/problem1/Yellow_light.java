package problem1;

import javax.swing.JFrame;

public class Yellow_light {
	public Yellow_light()
		{
			JFrame frame = new JFrame();
			frame.setSize(1000, 600);
			frame.setTitle("Traffic_light");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			Ellipse_yellow_component component = new Ellipse_yellow_component();
			frame.add(component);
		}

}