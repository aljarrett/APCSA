
import java.util.Scanner;

public class CircleTest
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the radius: ");
    double r = scan.nextDouble();
    Circle circle1 = new Circle(r);
    double area = circle1.getArea();
    System.out.println("radius = " + r + " area = " + area);
  }
}
