package problem1;

import javax.swing.JFrame;

public class Traffic_light {
	private String color=null;
	public Traffic_light(){}
	public void show_traffic_light ()
	{

		if(color=="green")
		{
			Green_light();
		}
		else if (color=="red")
		{
			Red_light();
		}
		else 
		{
			Yellow_light();
		}
//		else
//		{
//			abort();
//		}
	}
	public void getColor(String Color) 
	{
		color=Color;
	}
	private void Yellow_light()
	{
		JFrame frame = new JFrame();
		frame.setSize(1000, 600);
		frame.setTitle("Traffic_light");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		Ellipse_yellow_component component = new Ellipse_yellow_component();
		frame.add(component);
	}
	private void Red_light ()
	{
		JFrame frame = new JFrame();
		frame.setSize(1000, 600);
		frame.setTitle("Traffic_light");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		Ellipse_red_component component = new Ellipse_red_component();
		frame.add(component);
	}
	private void Green_light()
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
