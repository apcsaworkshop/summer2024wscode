/*
 * Coin Tester
 * June 25, 2024
 * Mrs. Ayodeji 
*/
public class CoinTester
{
	public static void main(String args[])
	{
		Coin c1 = new Coin(0.05, "Nickel");
		Coin c2 = new Coin(0.12, "dime");
		Coin c3 = new Coin(0.01, "penny", "copper");

		System.out.println(c1.getName());
		System.out.println(c1.getValue());
		System.out.println(c1.getMetal());

		System.out.println(c2.getName());
		System.out.println(c2.getValue());
		System.out.println(c2.getMetal());

		System.out.println(c3.getName());
		System.out.println(c3.getValue());
		System.out.println(c3.getMetal());

		c1.setName("nickel");
		c2.setValue(0.12);

		System.out.println(c1.getName());
		System.out.println(c1.getValue());
		System.out.println(c1.getMetal());

		System.out.println(c2.getName());
		System.out.println(c2.getValue());
		System.out.println(c2.getMetal());		
	}
}
