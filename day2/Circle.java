/* Circle Class: Circle class definition File 
 * July 9, 2024
 * Mrs. Ayodeji	
*/
public class Circle
{
	private int radius;

	public Circle(int rad)
	{
		radius = rad;
	}

	public void setRadius(int rad)
	{
		radius += rad;
	}

	public int getDiameter()
	{
		int diameter;
		diameter = 2*radius;
		return diameter;
	}
}
