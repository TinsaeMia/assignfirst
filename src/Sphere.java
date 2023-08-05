import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
public class Sphere extends Circle
{ private double radius;

    public void SetRadius(double ra)
    {
        radius=ra;
    }

    public  double getRadius() {
        return radius;
    }
    public double sVolume()
    {
        double vol=((1.3333)*(super.PI)*pow(radius,3));
        return vol;
    }
    public double sarea()
    {
        double area=(4*super.PI*pow(radius,2));
        return area;
    }
    public  void display(String co)
{
    System.out.println("the color of the Sphere is : "+ co);

}
}
