package problem4;

public class Help_cashier {
	private int amount_due=0;
	private int amount_received=0;
	private int change=0;
	private int dollars=0;
	private int quarters=0;
	private int dimes=0;
	private int nickels=0;
	private int pennies=0;
	public Help_cashier(double amountDue ,double amountRreceived)
	{
		amount_due=(int) (amountDue*100);
		amount_received=(int) (amountRreceived*100);
		total_change();
		give_coin();
		give_cash();
	}
	private void total_change()
	{		
		change=amount_received-amount_due;
	}
	private void give_coin()
	{
		int temp=change%100;
		quarters=temp/25;
		temp = temp%25;
		dimes=temp/10;
		temp = temp%10;
		nickels=temp/5;
		temp=temp%5;
		pennies=temp;
	}
	private void give_cash()
	{
		dollars=change/100;
	}
	public void result()
	{
		System.out.println("you need return "+dollars+" dollars "+quarters+" quarters"+dimes+" dimes"+nickels+" nickels"+pennies+" pennies");
	}
}
