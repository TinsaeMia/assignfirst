import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
public class Cylinder extends Circle {
  private   double radius,height;

    public void SetRadius(double ra)
    {
        radius=ra;
    }

    public  double getRadius() {
        return radius;
    }
    public void setHeight(double ha)
    {   height=ha;
    }

    public  double getHeight() {
        return height;
    }
    public double serfaceArea()
    {
      double area=2*super.PI*pow(radius,2)+2*super.PI*radius*height;
      return area;
    }
    public double volume()
    {
        double vol=super.PI*pow(radius,2)*height;
        return vol;
    }

  public  void display(String co)
    {
        System.out.println("the color of the Cylinder is : "+ co);

    }


}
