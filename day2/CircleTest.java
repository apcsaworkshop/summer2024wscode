public class CircleTest
{
  public static void main(String[] args)
  {
    Circle c1 = new Circle(5);
    System.out.println(c1.getDiameter());
    c1.setRadius(10);
    System.out.println(c1.getDiameter());
  }
}
