import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Triangle extends Shape{
    private  double base ,height;

    public void setBase(double ba)
    {
        base=ba;
    }
    public double  getBase() {
        return base;
    }
    public void setHeight(double hi)
    {
        height=hi;
    }
    public double  getHeight() {
        return height;
    }

   public double calculateArea()
    {
        double area=0.5*base*height;
        return area;
    }
    public double calculatePerimeter ()
    {double hypo=sqrt(pow(base,2)+pow(height,2));
        double peri=base+height+hypo;

        return peri;
    }
    public void display(String co)
    {
        System.out.println("the color of the triangle is : "+ co);

    }

}
