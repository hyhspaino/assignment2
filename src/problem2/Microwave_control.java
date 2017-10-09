package problem2;

public class Microwave_control {
	private static int increasing_time=30;
	private int[] switching_power= {1,2};
   // private int reset_button=0;
    private int start_button=0;
    public void  Microwave_control()
    {
    	System.out.println("Welcome to use Microwave control");
    	int time=0;
    	System.out.println();
    	while(1)
    	if(start_button=1)
    		break;
    }
    private void start(int time,String power)
    {
    	System.out.println("Cooking for "+time "s at level "+power);
    	start_button=1;
    }
    private void reset()
    {
    	start_button=0;
    }
    private int cooking_time(int time)
    {
    	return (time += increasing_time);
    }
    private int cooking_power(int power)
    {
            if(power==1)
            	return switching_power[0];
            else
            	return switching_power[1];
    }
}
